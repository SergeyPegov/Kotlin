import kotlin.math.sqrt

fun Double.sqrt(): Double {
    return sqrt(this)
}
fun main() {
    val sqrtAnonymous: (Double) -> Double = { number ->
        sqrt(number)
    }
    println("При помощи анонимной функции")
    val number = 144.0
    val result = sqrtAnonymous(number)
    println("Квадратный корень $number равен $result")

    println("При помощи функции-расширения")
    val number1 = 169.0
    val result1 = number1.sqrt()
    println("Квадратный корень $number1 равен $result1")
}


