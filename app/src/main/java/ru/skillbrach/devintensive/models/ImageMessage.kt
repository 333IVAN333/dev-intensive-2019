package ru.skillbrach.devintensive.models


import ru.skillbrach.devintensive.extentions.humanizeDiff
import java.util.Date

class ImageMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var image: String?
) : BaseMessage(id, from, chat, isIncoming, date) {
    override fun formatMessage(): String {
        return "id:$id ${from?.firstName} ${if(isIncoming) "получил" else "отправил"} изображение \"$image\" ${date.humanizeDiff()}"
    }
}