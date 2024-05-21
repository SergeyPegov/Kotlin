data class Car(val brand: String, val color: String, val number: String)

fun main() {
    val car1 = Car("Audi", "Черный", "A111AA52")
    val car2 = Car("BMW", "Синий", "A333AA52")
    val car3 = Car("Mercedes-benz", "Серый", "A555AA52")
    println("Информация об автомобиле 1: $car1")
    println("Информация об автомобиле 2: $car2")
    println("Информация об автомобиле 3: $car3")
}