package ru.netology

fun main() {
    val amountPrev = 20000_00
    val amountCurr = 100_00
    val musicLover = true
    val discountStandardAmount = 100_00
    val discountPercentage = 5
    val discountPercentageMusicLover = 1
    val rezultNoMusicLover: Int = if (amountPrev <= 1000_00) {
        amountCurr
    } else if (amountPrev > 1000_00 && amountPrev <= 10000_00) {
        if (amountCurr > discountStandardAmount) amountCurr - discountStandardAmount else 0
    } else {
        (amountCurr * (1 - (discountPercentage / 100.00))).toInt()
    }
    val rezult: Int =
        if (musicLover) (rezultNoMusicLover * (1 - (discountPercentageMusicLover / 100.00))).toInt() else rezultNoMusicLover
    val rubles: Int = rezult / 100
    val pennies: Int = rezult % 100
    println("Стоймость покупки с учётом скидки: $rubles руб. $pennies коп.")
}
