package ru.skillbrach.devintensive.utils

object Utils{
    fun parseFullName(fullName: String?) : Pair<String?, String?> {
        if(fullName != null && fullName.trim().isEmpty())
            return Pair(null, null)

        val parts: List<String>? = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return firstName to lastName
    }

    fun toInitials(firstName: String?, lastName: String?) : String? {
        val char1: Char? = firstName?.trim()?.first()?.toUpperCase()
        val char2: Char? = lastName?.trim()?.first()?.toUpperCase()
        var result = "${char1 ?: ""}${char2 ?: ""}"

        return if(result.isEmpty()) null else result
    }

    fun transliteration(payload: String, divider: String = " ") : String {

        var resultText = ""
            payload.forEach {
                resultText += when (it) {
                    'а' -> "a"
                    'А' -> "A"
                    'б' -> "b"
                    'Б' -> "B"
                    'в' -> "v"
                    'В' -> "V"
                    'г' -> "g"
                    'Г' -> "G"
                    'д' -> "d"
                    'Д' -> "D"
                    'е', 'ё', 'э' -> "e"
                    'Е', 'ё', 'э' -> "E"
                    'ж' -> "zh"
                    'Ж' -> "Zh"
                    'з' -> "z"
                    'З' -> "Z"
                    'и', 'й', 'ы' -> "i"
                    'И', 'й', 'ы' -> "I"
                    'к' -> "k"
                    'К' -> "K"
                    'л' -> "l"
                    'Л' -> "L"
                    'м' -> "m"
                    'М' -> "M"
                    'н' -> "n"
                    'Н' -> "N"
                    'о' -> "o"
                    'О' -> "O"
                    'п' -> "p"
                    'П' -> "P"
                    'р' -> "r"
                    'Р' -> "R"
                    'с' -> "s"
                    'С' -> "S"
                    'т' -> "t"
                    'Т' -> "T"
                    'у' -> "u"
                    'У' -> "U"
                    'ф' -> "f"
                    'Ф' -> "F"
                    'х' -> "h"
                    'Х' -> "H"
                    'ц' -> "c"
                    'Ц' -> "C"
                    'ч' -> "ch"
                    'Ч' -> "Ch"
                    'ш', 'щ' -> "sh"
                    'Ш', 'Щ' -> "Sh"
                    'ю'-> "yu"
                    'Ю'-> "Yu"
                    'я'-> "ya"
                    'Я'-> "Ya"
                    ' ' -> divider
                    else -> it.toString()
                }
        }

        return resultText
    }




}