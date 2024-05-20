fun checkYear(year:Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}
fun main(){
    print("Введите год для проверки: ")
    val year = readLine()!!.toInt()
    if (checkYear(year)) {
        println("$year - год високосный")
    } else {
        println("$year - год не високосный")
    }
}