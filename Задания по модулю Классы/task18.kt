class Aircraft(val aircraftNumber: String, val maxFlightRange: Int, val fuelCapacity: Int) {
    var fuelConsumptionPer100Km: Double = 1200.0
        get() {
            return (fuelCapacity.toDouble() / maxFlightRange) * 100
        }
    init {
        fuelConsumptionPer100Km = (fuelCapacity.toDouble() / maxFlightRange) * 100
    }
}
fun main() {
    val aircraft = Aircraft("Boeing-747", 14320, 242470)
    println("Номер воздушного судна: ${aircraft.aircraftNumber}")
    println("Максимальная дальность полета: ${aircraft.maxFlightRange} км")
    println("Вместимость топливного бака: ${aircraft.fuelCapacity} литров")
    println("Расход топлива на 100 км: ${aircraft.fuelConsumptionPer100Km} литров")
}