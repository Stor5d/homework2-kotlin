package ru.netology

fun main() {
    val likes = 11
    val text = if ((((likes - 1) % 10) == 0) && (likes != 11)) "человеку" else "людям"
    println("Понравилось $likes $text")
}