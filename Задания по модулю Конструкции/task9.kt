fun main() {
    val array = arrayOf(
        arrayOf("Россия", "Китай", "Кыргызстан"),
        arrayOf("Москва", "Пекин", "Бишкек"),
        arrayOf("Рубль", "Юань", "Сом")
    )
    val numberArray = array[0].size
    for (i in 0 until numberArray) {
        val country = array[0][i]
        val capital = array[1][i]
        val currency = array[2][i]
        println("$country, $capital, $currency")
    }
}