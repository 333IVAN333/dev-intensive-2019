package ru.skillbrach.devintensive.extentions

import java.lang.IllegalStateException
import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

enum class TimeUnit {
    SECONDS,
    MINUTES,
    HOURS,
    DAY
}

fun Date.humanizeDiff(date: Date = Date()) : String {
    return ""
}

fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy") : String {
    val dateFormatter = SimpleDateFormat(pattern, Locale("ru"))

    return dateFormatter.format(this)
}

fun Date.add(value: Int, units: TimeUnit = TimeUnit.SECONDS) : Date {
    var time = this.time

    time += when (units) {
        TimeUnit.SECONDS -> value * SECOND
        TimeUnit.MINUTES -> value * MINUTE
        TimeUnit.HOURS -> value * HOUR
        TimeUnit.DAY -> value * DAY
    }
    this.time = time

    return this
}