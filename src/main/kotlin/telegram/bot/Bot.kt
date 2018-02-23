package telegram.bot

import com.google.gson.GsonBuilder
import io.ktor.application.call
import io.ktor.application.log
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.netty.NettyApplicationEngine
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class TelegramBot(TELEGRAM_BOT_KEY: String) {
    private val TELEGRAM_API_LINK = "https://api.telegram.org/"
    private val api: TelegramBotApi

    private var server: NettyApplicationEngine? = null
    private val commandsToHandlers = HashMap<String, ArrayList<() -> Unit>>()

    init {
        val gson = GsonBuilder()
                .setLenient()
                .create()
        api = Retrofit.Builder()
                .baseUrl(TELEGRAM_API_LINK + "bot" + TELEGRAM_BOT_KEY + "/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(TelegramBotApi::class.java)
    }

    fun run(url: String, port: Int = 8080) {
        api.setWebhook(url)
                .filter{ it.ok }.map{ it.result }
                .filter{ it!! }.subscribe {
            server = embeddedServer(Netty, port) {
                api.getWebhookInfo().filter{ it.ok }.map{ it.result }
                        .subscribe {
                            log.info("Webhook url: " + it?.url)
                            log.info("Last error message: " + it?.last_error_message)
                            log.info("Last error date: " + it?.last_error_date)
                            log.info("Count updates in pending: " + it?.pending_update_count)
                        }
                routing {
                    get("/") {
                        println("Parameters: " + call.request.queryParameters)
                    }
                }
            }.start(wait = true)
        }
    }

    fun stop(gracePeriod: Long, timeout: Long, timeUnit: TimeUnit) {
        api.deleteWebhook().filter{ it.ok }.map{ it.result }
                .subscribe{
            it?.let {
                if (!it) println("Unsuccessful Webhook deletion")
                server?.stop(gracePeriod, timeout, timeUnit)
            }
        }
    }

    fun api(): TelegramBotApi = api

    fun addHandler(command: String, callback: () -> Unit) {
        var values = commandsToHandlers[command]
        if (values == null) {
            values = ArrayList<() -> Unit>()
            commandsToHandlers.put(command, values)
        }
        values.add(callback)
    }
}