fun main() {
    print("Введите сумму вклада: ")
    val Deposit = readLine()!!.toDouble()
    print("Введите длительность вклада (в месяцах): ")
    val durationMonths = readLine()!!.toInt()
    print("Введите ежемесячный процент по вкладу: ")
    val monthPercent = readLine()!!.toDouble()

    var currentAmount = Deposit
    for (month in 1..durationMonths) {

        val profitMonth  = currentAmount * (monthPercent / 100)

        currentAmount += profitMonth

        println("Месяц $month:")
        println("Прирост вклада: %.2f".format(profitMonth))
        println("Итоговая сумма вклада: %.2f".format(currentAmount))
        println()
    }
}
