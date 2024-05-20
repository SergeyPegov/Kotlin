fun main() {
    val printArray = { array: Array<String> ->
        array.forEach { element ->
            println(element)
        }
    }
    val data = arrayOf("Иванов Иван", "Петрова Мария", "Сидоров Никита")
    printArray(data)
}
