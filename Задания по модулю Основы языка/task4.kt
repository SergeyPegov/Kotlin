fun main(){
    print("Введите Ваше имя: ")
    var userName: String? = readLine()
    var stringName: String = userName.toString()
    println("Привет, $stringName")
}