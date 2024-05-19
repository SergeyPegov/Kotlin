fun main() {
    val firstQuestion: String = "Какое самое большое животное на Земле?\n1. Синий кит\n2. Слон\n3. Африканский лев\nВведите номер варианта: "
    val secondQuestion: String = "Какая планета находится ближе всего к Солнцу?\n1. Венера\n2. Марс\n3. Меркурий\nВведите номер варианта: "
    val thirdQuestion: String = "Какой элемент обозначается символом 'O'?\n1.Медь\n2.Кислород\n3.Серебро\nВведите номер варианта: "
    val fourthQuestion: String = "Сколько материков на Земле?\n1.5\n2.6\n3.7\nВведите номер варианта: "
    val fifthQuestion: String = "Кто написал роман 'Война и мир'\n1.Достоевский\n2.Толстой\n3.Чехов\nВведите номер варианта: "
    var res = 0

    print(firstQuestion)
    val firstAnswer: String? = readLine()
    if (!firstAnswer.isNullOrEmpty()) {
        val b: Int = firstAnswer.toInt()
        if (b == 1) {
            res += 1
        }
    }
    print(secondQuestion)
    val secondAnswer: String? = readLine()
    if (!secondAnswer.isNullOrEmpty()) {
        val b: Int = secondAnswer.toInt()
        if (b == 3) {
            res += 1
        }
    }
    print(thirdQuestion)
    val thirdAnswer: String? = readLine()
    if (!thirdAnswer.isNullOrEmpty()) {
        val b: Int = thirdAnswer.toInt()
        if (b == 2) {
            res += 1
        }
    }
    print(fourthQuestion)
    val fourthAnswer: String? = readLine()
    if (!fourthAnswer.isNullOrEmpty()) {
        val b: Int = fourthAnswer.toInt()
        if (b == 3) {
            res += 1
        }
    }
    print(fifthQuestion)
    val fifthAnswer: String? = readLine()
    if (!fifthAnswer.isNullOrEmpty()) {
        val b: Int = fifthAnswer.toInt()
        if (b == 2) {
            res += 1
        }
    }
    when(res){
       1,2 -> println("Ваши знания требуют улучшения.")
        3 -> println("Ваши знания на удовлетворительном уровне.")
        4 -> println("Ваши знания на крепкую четверку.")
        5 -> println("Ваши знания на превосходном уровне!")
    }
}
