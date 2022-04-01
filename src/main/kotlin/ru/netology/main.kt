package ru.netology

fun main() {
    println(likesText(21))
}

fun likesText(likes: Int): String {
    val text = if ((((likes - 1) % 10) == 0) && (likes % 100 != 11)) "человеку" else "людям"
    return "Понравилось $likes $text"
}