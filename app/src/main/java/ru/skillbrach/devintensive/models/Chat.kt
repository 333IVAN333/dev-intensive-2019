package ru.skillbrach.devintensive.models

class Chat(
    val id: String,
    val meembers: MutableList<User> = mutableListOf(),
    val messages: MutableList<BaseMessage> = mutableListOf()
) {
}