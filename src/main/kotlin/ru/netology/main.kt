package ru.netology

fun main() {
    val amountPrev = 20000_00
    val amountCurr = 100_00
    val musicLover = true
    val discountStandardAmount = 100_00
    val discountPercentage = 5
    val discountPercentageMusicLover = 1
    val range1 = 1000_00
    val range2 = 10000_00
    val rezult1: Int = if (amountPrev <= range1) {
        amountCurr
    } else if (amountPrev > range1 && amountPrev <= range2) {
        if (amountCurr > discountStandardAmount) amountCurr - discountStandardAmount else 0
    } else {
        (amountCurr * (1 - (discountPercentage / 100.00))).toInt()
    }
    val rezult2: Int = if (musicLover) (rezult1 * (1 - (discountPercentageMusicLover / 100.00))).toInt() else rezult1
    val rubles: Int = rezult2 / 100
    val pennies: Int = rezult2 % 100
    println("Стоймость покупки с учётом скидки: $rubles руб. $pennies коп.")
}
