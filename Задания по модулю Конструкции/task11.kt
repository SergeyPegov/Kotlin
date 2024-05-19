fun main() {
    val workplaces = mutableMapOf(
        1 to "Иван Иванов",
        2 to "Петр Петров",
        3 to "Сергей Сергеев",
        4 to "Мария Мариева"
    )

    while (true) {
        println("Выберите действие:")
        println("1. Посмотреть список всех рабочих мест")
        println("2. Узнать кто занимает рабочее место по его номеру")
        println("3. Добавить нового сотрудника")
        println("4. Выйти из программы")

        val choice = readLine()?.toIntOrNull()
        when (choice) {
            1 -> {
                println("Список всех рабочих мест:")
                workplaces.forEach { (workplace, employee) ->
                    println("Рабочее место №$workplace: $employee")
                }
            }
            2 -> {
                println("Введите номер рабочего места:")
                val workplaceNumber = readLine()?.toIntOrNull()
                if (workplaceNumber != null) {
                    val employee = workplaces[workplaceNumber]
                    if (employee != null) {
                        println("Рабочее место №$workplaceNumber занимает: $employee")
                    } else {
                        println("Рабочее место №$workplaceNumber свободно или не существует.")
                    }
                } else {
                    println("Неправильный ввод номера рабочего места.")
                }
            }
            3 -> {
                println("Введите номер рабочего места для нового сотрудника:")
                val workplaceNumber = readLine()?.toIntOrNull()
                if (workplaceNumber != null) {
                    println("Введите ФИО нового сотрудника:")
                    val employeeName = readLine()
                    if (employeeName != null && employeeName.isNotBlank()) {
                        workplaces[workplaceNumber] = employeeName
                        println("Сотрудник $employeeName добавлен на рабочее место №$workplaceNumber.")
                    } else {
                        println("Неправильный ввод ФИО сотрудника.")
                    }
                } else {
                    println("Неправильный ввод номера рабочего места.")
                }
            }
            4 -> {
                println("Выход")
                break
            }
            else -> {
                println("Не та кнопка, попробуйте снова.")
            }
        }
    }
}
