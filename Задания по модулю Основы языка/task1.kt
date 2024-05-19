fun main(){
    val someVariable: Any? = 25
    val newVariable = (someVariable as Int) / 2.5
    // newVariable имеет тип Double
    println(newVariable::class.simpleName)
}