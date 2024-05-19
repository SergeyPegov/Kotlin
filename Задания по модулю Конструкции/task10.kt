fun main() {
    val cities = mutableListOf<String>()

    while(true) {
        println("Выберите действие:")
        println("1. Добавить город")
        println("2. Посмотреть список городов")
        println("3. Посмотреть список уникальных городов")
        println("4. Выйти из программы")

        val choice = readLine()?.toIntOrNull()
        when(choice) {
            1 -> {
                println("Введите название города: ")
                val city = readLine()
                city?.let { cities.add(it) }
            }
            2 -> {
                println("Список всех городов: ")
                cities.forEach{println(it)}
            }
            3 -> {
                println("Список уникальных городов: ")
                cities.distinct().forEach{println(it)}
            }
            4 -> {
                println("Выход")
                break
            }
            else -> {
                println("Не та кнопка, попробуйте снова")
            }
        }
    }
}