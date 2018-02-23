package telegram.bot.containers

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Web helpers

data class Response<T>(
        @SerializedName("ok")
        @Expose
        var ok: Boolean,
        @SerializedName("description")
        @Expose
        var description: String? = null,
        @SerializedName("error_code")
        @Expose
        var error_code: Int? = null,
        @SerializedName("result")
        @Expose
        var result: T? = null
)

data class Update(
        @SerializedName("update_id")
        @Expose
        var update_id: Int,
        @SerializedName("message")
        @Expose
        var message: Message? = null,
        @SerializedName("edited_message")
        @Expose
        var edited_message: Message? = null,
        @SerializedName("channel_post")
        @Expose
        var channel_post: Message? = null,
        @SerializedName("edited_channel_post")
        @Expose
        var edited_channel_post: Message? = null,
        @SerializedName("inline_query")
        @Expose
        var inline_query: InlineQuery? = null,
        @SerializedName("chosen_inline_result")
        @Expose
        var chosen_inline_result: ChosenInlineResult? = null,
        @SerializedName("callback_query")
        @Expose
        var callback_query: CallbackQuery? = null,
        @SerializedName("shipping_query")
        @Expose
        var shipping_query: ShippingQuery? = null,
        @SerializedName("pre_checkout_query")
        @Expose
        var pre_checkout_query: PreCheckoutQuery? = null
)

data class WebhookInfo(
        @SerializedName("url")
        @Expose
        var url: String,
        @SerializedName("has_custom_certificate")
        @Expose
        var has_custom_certificate: Boolean,
        @SerializedName("pending_update_count")
        @Expose
        var pending_update_count: Int,
        @SerializedName("last_error_date")
        @Expose
        var last_error_date: Int? = null,
        @SerializedName("last_error_message")
        @Expose
        var last_error_message: String? = null,
        @SerializedName("max_connections")
        @Expose
        var max_connections: Int? = null,
        @SerializedName("allowed_updates")
        @Expose
        var allowed_updates: Array<String>? = null
)

// Common structs

data class User(
        @SerializedName("id")
        @Expose
        var id: Int,
        @SerializedName("is_bot")
        @Expose
        var is_bot: Boolean,
        @SerializedName("first_name")
        @Expose
        var first_name: String,
        @SerializedName("last_name")
        @Expose
        var last_name: String? = null,
        @SerializedName("username")
        @Expose
        var username: String? = null,
        @SerializedName("language_code")
        @Expose
        var language_code: String? = null
)

data class Chat(
        @SerializedName("id")
        @Expose
        var id: Int,
        @SerializedName("type")
        @Expose
        var type: String,
        @SerializedName("title")
        @Expose
        var title: String? = null,
        @SerializedName("username")
        @Expose
        var username: String? = null,
        @SerializedName("first_name")
        @Expose
        var first_name: String? = null,
        @SerializedName("last_name")
        @Expose
        var last_name: String? = null,
        @SerializedName("all_members_are_administrators")
        @Expose
        var all_members_are_administrators: Boolean? = null,
        @SerializedName("photo")
        @Expose
        var photo: ChatPhoto? = null,
        @SerializedName("description")
        @Expose
        var description: String? = null,
        @SerializedName("invite_link")
        @Expose
        var invite_link: String? = null,
        @SerializedName("pinned_message")
        @Expose
        var pinned_message: Message? = null,
        @SerializedName("sticker_set_name")
        @Expose
        var sticker_set_name: Boolean? = null,
        @SerializedName("can_set_sticker_set")
        @Expose
        var can_set_sticker_set: Boolean? = null
)

data class Message(
        @SerializedName("message_id")
        @Expose
        var message_id: Int,
        @SerializedName("from")
        @Expose
        var from: User? = null,
        @SerializedName("date")
        @Expose
        var date: Int,
        @SerializedName("chat")
        @Expose
        var chat: Chat,
        @SerializedName("forward_from")
        @Expose
        var forward_from: User? = null,
        @SerializedName("forward_from_chat")
        @Expose
        var forward_from_chat: Chat? = null,
        @SerializedName("forward_from_message_id")
        @Expose
        var forward_from_message_id: Int? = null,
        @SerializedName("forward_signature")
        @Expose
        var forward_signature: String? = null,
        @SerializedName("forward_date")
        @Expose
        var forward_date: Int? = null,
        @SerializedName("reply_to_message")
        @Expose
        var reply_to_message: Message? = null,
        @SerializedName("edit_date")
        @Expose
        var edit_date: Int? = null,
        @SerializedName("media_group_id")
        @Expose
        var media_group_id: String? = null,
        @SerializedName("author_signature")
        @Expose
        var author_signature: String? = null,
        @SerializedName("text")
        @Expose
        var text: String? = null,
        @SerializedName("entities")
        @Expose
        var entities: Array<MessageEntity>? = null,
        @SerializedName("caption_entities")
        @Expose
        var caption_entities: Array<MessageEntity>? = null,
        @SerializedName("audio")
        @Expose
        var audio: Audio? = null,
        @SerializedName("document")
        @Expose
        var document: Document? = null,
        @SerializedName("game")
        @Expose
        var game: Game? = null,
        @SerializedName("photo")
        @Expose
        var photo: Array<PhotoSize>? = null,
        @SerializedName("sticker")
        @Expose
        var sticker: Sticker? = null,
        @SerializedName("video")
        @Expose
        var video: Video? = null,
        @SerializedName("voice")
        @Expose
        var voice: Voice? = null,
        @SerializedName("video_note")
        @Expose
        var video_note: VideoNote? = null,
        @SerializedName("caption")
        @Expose
        var caption: String? = null,
        @SerializedName("contact")
        @Expose
        var contact: Contact? = null,
        @SerializedName("location")
        @Expose
        var location: Location? = null,
        @SerializedName("venue")
        @Expose
        var venue: Venue? = null,
        @SerializedName("new_chat_members")
        @Expose
        var new_chat_members: Array<User>? = null,
        @SerializedName("left_chat_member")
        @Expose
        var left_chat_member: User? = null,
        @SerializedName("new_chat_title")
        @Expose
        var new_chat_title: String? = null,
        @SerializedName("new_chat_photo")
        @Expose
        var new_chat_photo: Array<PhotoSize>? = null,
        @SerializedName("delete_chat_photo")
        @Expose
        var delete_chat_photo: Boolean = true,
        @SerializedName("group_chat_created")
        @Expose
        var group_chat_created: Boolean = true,
        @SerializedName("supergroup_chat_created")
        @Expose
        var supergroup_chat_created: Boolean = true,
        @SerializedName("channel_chat_created")
        @Expose
        var channel_chat_created: Boolean = true,
        @SerializedName("migrate_to_chat_id")
        @Expose
        var migrate_to_chat_id: Int? = null,
        @SerializedName("migrate_from_chat_id")
        @Expose
        var migrate_from_chat_id: Int? = null,
        @SerializedName("pinned_message")
        @Expose
        var pinned_message: Message? = null,
        @SerializedName("invoice")
        @Expose
        var invoice: Invoice? = null,
        @SerializedName("successful_payment")
        @Expose
        var successful_payment: SuccessfulPayment? = null,
        @SerializedName("connected_website")
        @Expose
        var connected_website: String? = null
)

data class MessageEntity(
        @SerializedName("type")
        @Expose
        var type: String,
        @SerializedName("offset")
        @Expose
        var offset: Int,
        @SerializedName("length")
        @Expose
        var length: Int,
        @SerializedName("url")
        @Expose
        var url: String? = null,
        @SerializedName("user")
        @Expose
        var user: User? = null
)

data class PhotoSize(
        @SerializedName("file_id")
        @Expose
        var file_id: String,
        @SerializedName("width")
        @Expose
        var width: Int,
        @SerializedName("height")
        @Expose
        var height: Int,
        @SerializedName("file_size")
        @Expose
        var file_size: Int? = null
)

data class Audio(
        @SerializedName("file_id")
        @Expose
        var file_id: String,
        @SerializedName("duration")
        @Expose
        var duration: Int,
        @SerializedName("performer")
        @Expose
        var performer: String? = null,
        @SerializedName("title")
        @Expose
        var title: String? = null,
        @SerializedName("mime_type")
        @Expose
        var mime_type: String? = null,
        @SerializedName("file_size")
        @Expose
        var file_size: Int? = null
)

data class Document(
        @SerializedName("file_id")
        @Expose
        var file_id: String,
        @SerializedName("thumb")
        @Expose
        var thumb: PhotoSize? = null,
        @SerializedName("file_name")
        @Expose
        var file_name: String? = null,
        @SerializedName("mime_type")
        @Expose
        var mime_type: String? = null,
        @SerializedName("file_size")
        @Expose
        var file_size: Int? = null
)

data class Video(
        @SerializedName("file_id")
        @Expose
        var file_id: String,
        @SerializedName("width")
        @Expose
        var width: Int,
        @SerializedName("height")
        @Expose
        var height: Int,
        @SerializedName("duration")
        @Expose
        var duration: Int,
        @SerializedName("thumb")
        @Expose
        var thumb: PhotoSize? = null,
        @SerializedName("mime_type")
        @Expose
        var mime_type: String? = null,
        @SerializedName("file_size")
        @Expose
        var file_size: Int? = null
)

data class Voice(
        @SerializedName("file_id")
        @Expose
        var file_id: String,
        @SerializedName("duration")
        @Expose
        var duration: Int,
        @SerializedName("mime_type")
        @Expose
        var mime_type: String? = null,
        @SerializedName("file_size")
        @Expose
        var file_size: Int? = null
)

data class VideoNote(
        @SerializedName("file_id")
        @Expose
        var file_id: String,
        @SerializedName("length")
        @Expose
        var length: Int,
        @SerializedName("duration")
        @Expose
        var duration: Int,
        @SerializedName("thumb")
        @Expose
        var thumb: PhotoSize? = null,
        @SerializedName("file_size")
        @Expose
        var file_size: Int? = null
)

data class Contact(
        @SerializedName("phone_number")
        @Expose
        var phone_number: String,
        @SerializedName("first_name")
        @Expose
        var first_name: String,
        @SerializedName("last_name")
        @Expose
        var last_name: String? = null,
        @SerializedName("user_id")
        @Expose
        var user_id: Int? = null
)

data class Location(
        @SerializedName("longitude")
        @Expose
        var longitude: Float,
        @SerializedName("latitude")
        @Expose
        var latitude: Float
)

data class Venue(
        @SerializedName("location")
        @Expose
        var location: Location,
        @SerializedName("title")
        @Expose
        var title: String,
        @SerializedName("address")
        @Expose
        var address: String,
        @SerializedName("foursquare_id")
        @Expose
        var foursquare_id: String? = null
)

data class UserProfilePhotos(
        @SerializedName("total_count")
        @Expose
        var total_count: Int,
        @SerializedName("photos")
        @Expose
        var photos: Array<Array<PhotoSize>>
)

data class File(
        @SerializedName("file_id")
        @Expose
        var file_id: Int,
        @SerializedName("file_size")
        @Expose
        var file_size: Int? = null,
        @SerializedName("file_path")
        @Expose
        var file_path: String? = null
)

data class ReplyKeyboardMarkup(
        @SerializedName("keyboard")
        @Expose
        var keyboard: Array<Array<KeyboardButton>>,
        @SerializedName("resize_keyboard")
        @Expose
        var resize_keyboard: Boolean? = null,
        @SerializedName("one_time_keyboard")
        @Expose
        var one_time_keyboard: Boolean? = null,
        @SerializedName("selective")
        @Expose
        var selective: Boolean? = null
)

data class KeyboardButton(
        @SerializedName("text")
        @Expose
        var text: String,
        @SerializedName("request_contact")
        @Expose
        var request_contact: Boolean? = null,
        @SerializedName("request_location")
        @Expose
        var request_location: Boolean? = null
)

data class ReplyKeyboardRemove(
        @SerializedName("remove_keyboard")
        @Expose
        var remove_keyboard: Boolean = true,
        @SerializedName("selective")
        @Expose
        var selective: Boolean? = null
)

data class InlineKeyboardMarkup(
        @SerializedName("inline_keyboard")
        @Expose
        var inline_keyboard: Array<Array<InlineKeyboardButton>>? = null
)

data class InlineKeyboardButton(
        @SerializedName("text")
        @Expose
        var text: String,
        @SerializedName("url")
        @Expose
        var url: String? = null,
        @SerializedName("callback_data")
        @Expose
        var callback_data: String? = null,
        @SerializedName("switch_inline_query")
        @Expose
        var switch_inline_query: String? = null,
        @SerializedName("switch_inline_query_current_chat")
        @Expose
        var switch_inline_query_current_chat: String? = null,
        @SerializedName("callback_game")
        @Expose
        var callback_game: CallbackGame? = null,
        @SerializedName("pay")
        @Expose
        var pay: Boolean? = null
)

data class CallbackQuery(
        @SerializedName("id")
        @Expose
        var id: String,
        @SerializedName("from")
        @Expose
        var from: User,
        @SerializedName("message")
        @Expose
        var message: Message? = null,
        @SerializedName("inline_message_id")
        @Expose
        var inline_message_id: String? = null,
        @SerializedName("chat_instance")
        @Expose
        var chat_instance: String,
        @SerializedName("data")
        @Expose
        var data: String? = null,
        @SerializedName("game_short_name")
        @Expose
        var game_short_name: String? = null
)

data class ForceReply(
        @SerializedName("force_reply")
        @Expose
        var force_reply: Boolean = true,
        @SerializedName("selective")
        @Expose
        var selective: Boolean? = null
)

data class ChatPhoto(
        @SerializedName("small_file_id")
        @Expose
        var small_file_id: String,
        @SerializedName("big_file_id")
        @Expose
        var big_file_id: String
)

data class ChatMember(
        @SerializedName("user")
        @Expose
        var user: User,
        @SerializedName("status")
        @Expose
        var status: String,
        @SerializedName("until_date")
        @Expose
        var until_date: Int? = null,
        @SerializedName("can_be_edited")
        @Expose
        var can_be_edited: Boolean? = null,
        @SerializedName("can_change_info")
        @Expose
        var can_change_info: Boolean? = null,
        @SerializedName("can_post_messages")
        @Expose
        var can_post_messages: Boolean? = null,
        @SerializedName("can_edit_messages")
        @Expose
        var can_edit_messages: Boolean? = null,
        @SerializedName("can_delete_messages")
        @Expose
        var can_delete_messages: Boolean? = null,
        @SerializedName("can_invite_users")
        @Expose
        var can_invite_users: Boolean? = null,
        @SerializedName("can_restrict_members")
        @Expose
        var can_restrict_members: Boolean? = null,
        @SerializedName("can_pin_messages")
        @Expose
        var can_pin_messages: Boolean? = null,
        @SerializedName("can_promote_members")
        @Expose
        var can_promote_members: Boolean? = null,
        @SerializedName("can_send_messages")
        @Expose
        var can_send_messages: Boolean? = null,
        @SerializedName("can_send_media_messages")
        @Expose
        var can_send_media_messages: Boolean? = null,
        @SerializedName("can_send_other_messages")
        @Expose
        var can_send_other_messages: Boolean? = null,
        @SerializedName("can_add_web_page_previews")
        @Expose
        var can_add_web_page_previews: Boolean? = null
)

data class ResponseParameters(
        @SerializedName("migrate_to_chat_id")
        @Expose
        var migrate_to_chat_id: Int? = null,
        @SerializedName("retry_after")
        @Expose
        var retry_after: Int? = null
)

data class InputMedia(
        @SerializedName("type") // Photo or Video
        @Expose
        var type: String,
        @SerializedName("media")
        @Expose
        var media: String,
        @SerializedName("caption")
        @Expose
        var caption: String? = null,
        @SerializedName("parse_mode")
        @Expose
        var parse_mode: String? = null,
        // only for type: Video
        @SerializedName("width")
        @Expose
        var width: Int? = null,
        @SerializedName("height")
        @Expose
        var height: Int? = null,
        @SerializedName("duration")
        @Expose
        var duration: Int? = null,
        @SerializedName("supports_streaming")
        @Expose
        var supports_streaming: Boolean? = null
)

// Stickers

data class Sticker(
        @SerializedName("file_id")
        @Expose
        var file_id: String,
        @SerializedName("width")
        @Expose
        var width: Int,
        @SerializedName("height")
        @Expose
        var height: Int,
        @SerializedName("thumb")
        @Expose
        var thumb: PhotoSize? = null,
        @SerializedName("emoji")
        @Expose
        var emoji: String? = null,
        @SerializedName("set_name")
        @Expose
        var set_name: String? = null,
        @SerializedName("mask_position")
        @Expose
        var mask_position: MaskPosition? = null,
        @SerializedName("file_size")
        @Expose
        var file_size: Int? = null
)

data class StickerSet(
        @SerializedName("name")
        @Expose
        var name: String,
        @SerializedName("title")
        @Expose
        var title: String,
        @SerializedName("contains_masks")
        @Expose
        var contains_masks: Boolean,
        @SerializedName("stickers")
        @Expose
        var stickers: Array<Sticker>
)

data class MaskPosition(
        @SerializedName("point")
        @Expose
        var point: String,
        @SerializedName("x_shift")
        @Expose
        var x_shift: Float,
        @SerializedName("y_shift")
        @Expose
        var y_shift: Float,
        @SerializedName("scale")
        @Expose
        var scale: Float
)

// Inline mode

data class InlineQuery(
        @SerializedName("id")
        @Expose
        var id: String,
        @SerializedName("from")
        @Expose
        var from: User,
        @SerializedName("location")
        @Expose
        var location: Location? = null,
        @SerializedName("query")
        @Expose
        var query: String,
        @SerializedName("offset")
        @Expose
        var offset: String
)

// TODO: add InlineResults [20]

data class ChosenInlineResult(
        @SerializedName("result_id")
        @Expose
        var result_id: String,
        @SerializedName("from")
        @Expose
        var from: User,
        @SerializedName("location")
        @Expose
        var location: Location? = null,
        @SerializedName("inline_message_id")
        @Expose
        var inline_message_id: String? = null,
        @SerializedName("query")
        @Expose
        var query: String
)

// Payments

data class LabeledPrice(
        @SerializedName("label")
        @Expose
        var label: String,
        @SerializedName("amount")
        @Expose
        var amount: Int
)

data class Invoice(
        @SerializedName("title")
        @Expose
        var title: String,
        @SerializedName("description")
        @Expose
        var description: String,
        @SerializedName("start_parameter")
        @Expose
        var start_parameter: String,
        @SerializedName("currency")
        @Expose
        var currency: String,
        @SerializedName("total_amount")
        @Expose
        var total_amount: Int
)

data class ShippingAddress(
        @SerializedName("country_code")
        @Expose
        var country_code: String,
        @SerializedName("state")
        @Expose
        var state: String,
        @SerializedName("city")
        @Expose
        var city: String,
        @SerializedName("street_line1")
        @Expose
        var street_line1: String,
        @SerializedName("street_line2")
        @Expose
        var street_line2: String,
        @SerializedName("post_code")
        @Expose
        var post_code: String
)

data class OrderInfo(
        @SerializedName("name")
        @Expose
        var name: String? = null,
        @SerializedName("phone_number")
        @Expose
        var phone_number: String? = null,
        @SerializedName("email")
        @Expose
        var email: String? = null,
        @SerializedName("shipping_address")
        @Expose
        var shipping_address: ShippingAddress? = null
)

data class ShippingOption(
        @SerializedName("id")
        @Expose
        var id: String,
        @SerializedName("title")
        @Expose
        var title: String? = null,
        @SerializedName("prices")
        @Expose
        var prices: Array<LabeledPrice>? = null
)

data class SuccessfulPayment(
        @SerializedName("currency")
        @Expose
        var currency: String,
        @SerializedName("total_amount")
        @Expose
        var total_amount: Int,
        @SerializedName("invoice_payload")
        @Expose
        var invoice_payload: String,
        @SerializedName("shipping_option_id")
        @Expose
        var shipping_option_id: String? = null,
        @SerializedName("order_info")
        @Expose
        var order_info: OrderInfo? = null,
        @SerializedName("telegram_payment_charge_id")
        @Expose
        var telegram_payment_charge_id: String,
        @SerializedName("provider_payment_charge_id")
        @Expose
        var provider_payment_charge_id: String
)

data class ShippingQuery(
        @SerializedName("id")
        @Expose
        var id: String,
        @SerializedName("from")
        @Expose
        var from: User,
        @SerializedName("invoice_payload")
        @Expose
        var invoice_payload: String,
        @SerializedName("shipping_address")
        @Expose
        var shipping_address: ShippingAddress
)

data class PreCheckoutQuery(
        @SerializedName("id")
        @Expose
        var id: String,
        @SerializedName("from")
        @Expose
        var from: User,
        @SerializedName("currency")
        @Expose
        var currency: String,
        @SerializedName("total_amount")
        @Expose
        var total_amount: Int,
        @SerializedName("invoice_payload")
        @Expose
        var invoice_payload: String,
        @SerializedName("shipping_option_id")
        @Expose
        var shipping_option_id: String? = null,
        @SerializedName("order_info")
        @Expose
        var order_info: OrderInfo? = null
)

// Games

data class Game(
        @SerializedName("title")
        @Expose
        var title: String,
        @SerializedName("description")
        @Expose
        var description: String,
        @SerializedName("photo")
        @Expose
        var photo: Array<PhotoSize>,
        @SerializedName("text")
        @Expose
        var text: String? = null,
        @SerializedName("text_entities")
        @Expose
        var text_entities: Array<MessageEntity>? = null,
        @SerializedName("animation")
        @Expose
        var animation: Animation? = null
)

data class Animation(
        @SerializedName("file_id")
        @Expose
        var file_id: String,
        @SerializedName("thumb")
        @Expose
        var thumb: PhotoSize? = null,
        @SerializedName("file_name")
        @Expose
        var file_name: String,
        @SerializedName("mime_type")
        @Expose
        var mime_type: String? = null,
        @SerializedName("file_size")
        @Expose
        var file_size: Int? = null
)

class CallbackGame() {}

data class GameHighScore(
        @SerializedName("position")
        @Expose
        var position: Int,
        @SerializedName("user")
        @Expose
        var user: User,
        @SerializedName("score")
        @Expose
        var score: Int
)