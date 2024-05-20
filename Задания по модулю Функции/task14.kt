fun employeeInfo(fullName: String, position: String) {
    println("ФИО: $fullName")
    println("Должность: $position")
    println()
}

fun employeeInfo(fullName: String, age: Int, position: String) {
    println("ФИО: $fullName")
    println("Возраст: $age")
    println("Должность: $position")
    println()
}

fun employeeInfo(fullName: String, maritalStatus: String, position: String) {
    println("ФИО: $fullName")
    println("Семейное положение: $maritalStatus")
    println("Должность: $position")
    println()
}

fun employeeInfo(fullName: String, age: Int, maritalStatus: String, position: String) {
    println("ФИО: $fullName")
    println("Возраст: $age")
    println("Семейное положение: $maritalStatus")
    println("Должность: $position")
    println()
}

fun main() {
    employeeInfo("Иванов Иван Иванович", "Инженер")
    employeeInfo("Петрова Мария Сергеевна", 29, "Менеджер")
    employeeInfo("Сидоров Никита Петрович", "Женат", "Директор")
    employeeInfo("Кузнецова Ольга Николаевна", 34, "Не замужем", "Аналитик")
}


