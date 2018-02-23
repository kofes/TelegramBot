package telegram.bot

import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.http.*
import telegram.bot.containers.*

interface TelegramBotApi {
    @Headers("Content-Type: application/json")
    @GET("getMe")
    fun getMe(): Observable<Response<User>>
    @Headers("Content-Type: application/json")
    @GET("sendMessage")
    fun/*<ReplyMarkupT>*/ sendMessage(
            @Query("chat_id") chat_id: String,
            @Query("text") text: String,
            @Query("parse_mode") parse_mode: String? = null,
            @Query("disable_web_page_preview") disable_web_page_preview: Boolean? = null,
            @Query("disable_notification") disable_notification: Boolean? = null,
            @Query("reply_to_message_id") reply_to_message_id: Boolean? = null
//            @Query("reply_markup") reply_markup: ReplyMarkupT? = null
    ): Observable<Response<Message>>
    @Headers("Content-Type: application/json")
    @GET("getUpdates")
    fun getUpdates(
            @Query("offset") offset: Int? = null,
            @Query("limit") limit: Int? = null,
            @Query("timeout") timeout: Int? = null,
            @Query("allowed_updates") allowed_updates: Array<String>? = null
    ): Observable<Response<Array<Update>>>
    @Multipart
    @Headers("Content-Type: multipart/form-data")
    @POST("setWebhook")
    fun setWebhook(
            @Part("url") url: String,
            @Part("certificate") certificate: MultipartBody.Part? = null, // InputFile
            @Part("max_connections") max_connections: Int? = null,
            @Part("allowed_updates") allowed_updates: Array<String>? = null
    ): Observable<Response<Boolean>>
    @Headers("Content-Type: application/json")
    @POST("deleteWebhook")
    fun deleteWebhook(): Observable<Response<Boolean>>
    @Headers("Content-Type: application/json")
    @GET("getWebhookInfo")
    fun getWebhookInfo(): Observable<Response<WebhookInfo>>
}
