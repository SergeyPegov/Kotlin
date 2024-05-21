class Aircraft {
    val aircraftNumber: String = "Boeing-747"
    val maxFlightRange: Int = 14320
    val fuelCapacity: Int = 242470
    var fuelConsumptionPer100Km: Double = 1200.0
        get() {
          return (fuelCapacity.toDouble() / maxFlightRange) * 100
        }
}
fun main() {
    val aircraft = Aircraft()
    println("Номер воздушного судна: ${aircraft.aircraftNumber}")
    println("Максимальная дальность полета: ${aircraft.maxFlightRange} км")
    println("Вместимость топливного бака: ${aircraft.fuelCapacity} литров")
    println("Расход топлива на 100 км: ${aircraft.fuelConsumptionPer100Km} литров")
}