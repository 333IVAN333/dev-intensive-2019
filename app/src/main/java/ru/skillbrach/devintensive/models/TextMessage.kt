package ru.skillbrach.devintensive.models

import ru.skillbrach.devintensive.extentions.humanizeDiff
import java.util.Date

class TextMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var text: String?
) : BaseMessage(id, from, chat, isIncoming, date) {

    override fun formatMessage(): String {
        return "id:$id ${from?.firstName} ${if(isIncoming) "получил" else "отправил"} сообщение \"$text\" ${date.humanizeDiff()}"
    }
}