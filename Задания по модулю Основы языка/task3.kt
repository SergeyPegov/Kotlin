fun main() {
    val five: Char = '5'

    val fiveString: String = five.toString()
    println("String: $fiveString")
    val fiveByte: Byte = five.toString().toByte()
    println("Byte: $fiveByte")
    val fiveShort: Short = five.toString().toShort()
    println("Short: $fiveShort")
    val fiveInt: Int = five.toString().toInt()
    println("Int: $fiveInt")
    val fiveLong: Long = five.toString().toLong()
    println("Long: $fiveLong")
    val fiveFloat: Float = five.toString().toFloat()
    println("Float: $fiveFloat")
    val fiveDouble: Double = five.toString().toDouble()
    println("Double: $fiveDouble")
}