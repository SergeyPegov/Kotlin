fun main() {
    print("Введите число а: ")
    val a = readLine()?.toDoubleOrNull()
    print("Введите число b: ")
    val b = readLine()?.toDoubleOrNull()
    if (a != null && b != null) {
        val bool: Boolean = a > b
        println(bool)
    } else {
        println("Введены некорректрые занчения")
    }
}