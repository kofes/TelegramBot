import telegram.bot.TelegramBot

const val SERVER_URL = ""

fun main(args: Array<String>) {
    val bot = TelegramBot(Config().TELEGRAM_BOT_KEY).api()

    bot.getMe().filter { it.ok }.map { it.result }
            .subscribe {
                println("Bot id:\t\t"+it?.id)
                println("Bot name:\t"+it?.username)
            }
    val commands = ArrayList<Pair<Int, String>>()
    bot.getUpdates().filter { it.ok }.map { it.result }
            .subscribe {
                it?.forEach {
                    println("Update #" + it.update_id)
                    println("\tCallbackQuery: " + it.callback_query)
                    println("\tMessage: " + it.message)
                    println("\tMessageEntity: " + it.message?.entities?.get(0))
                    if (it.message?.entities?.get(0)?.type == "bot_command") {
                        val text = it.message?.text
                        val chat_id = it.message?.chat?.id
                        it.message?.entities?.get(0)?.length?.let {
                            text?.substring(0, it)
                        }?.let {
                                    commands.add(Pair(chat_id!!, it))
                                    println("\tBot command: " + it)
                                }
                    }
                }
            }
    commands.forEach {
        if  (it.second == "/start")
            bot.sendMessage/*<telegram.bot.containers.Mark>*/(it.first.toString(),"Hello world!")
                    .subscribe {
                        if (it.ok) {
                            println("Response: " + it.result?.text)
                        }
                    }
    }
//    bot.setWebhook("SERVER_URL").filter { it.ok }.map { it.result }
//            .subscribe {
//                if (it == true)
//                    println("Webhook is set to " + SERVER_URL)
//                else
//                    println("Webhook not set")
//            }
//
//    bot.getWebhookInfo().filter{ it.ok }.map { it.result }
//            .subscribe {
//                println("Webhook url:\t"+it?.url)
//            }
}