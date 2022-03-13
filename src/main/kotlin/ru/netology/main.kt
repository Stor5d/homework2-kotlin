import kotlin.math.roundToInt

fun main() {
    val amount = 4_667_33
    val commissionPercentage = 0.75
    val minCommission = 35_00
    val commission = (amount * commissionPercentage / 100.00).roundToInt()
    val commissionRezult: Int = if (commission > minCommission) commission else minCommission
    val rubles: Int = commissionRezult / 100
    val pennies: Int = commissionRezult % 100
    println("Комиссия составит: $rubles руб. $pennies коп.")
}