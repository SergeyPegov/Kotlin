fun employees(vararg employeeNames: String): Int {
    return employeeNames.size
}

fun main(){
    val numberOfEmployees1 = employees("Петя", "Ваня", "Маша")
    println("Количество сотрудников: $numberOfEmployees1")

    val numberOfEmployees2 = employees("Вика")
    println("Количество сотрудников: $numberOfEmployees2")

    val numberOfEmployees3 = employees()
    println("Количество сотрудников: $numberOfEmployees3")
}