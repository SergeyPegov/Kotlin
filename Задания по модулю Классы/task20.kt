interface Passenger {
    val passengerCapacity: Int
}

open class Aircraft(val aircraftNumber: String, val maxFlightRange: Int, val fuelCapacity: Int) {
    var fuelConsumptionPer100Km: Double = 1200.0
        get() {
            return (fuelCapacity.toDouble() / maxFlightRange) * 100
        }
}

class Boeing747(
    aircraftNumber: String,
    maxFlightRange: Int,
    fuelCapacity: Int,
    override val passengerCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, fuelCapacity), Passenger

fun main() {
    val boeing747 = Boeing747("Boeing-747", 14320, 242470, 524)

    println("Номер воздушного судна: ${boeing747.aircraftNumber}")
    println("Максимальная дальность полета: ${boeing747.maxFlightRange} км")
    println("Вместимость топливного бака: ${boeing747.fuelCapacity} литров")
    println("Расход топлива на 100 км: ${boeing747.fuelConsumptionPer100Km} литров")
    println("Вместимость пассажиров: ${boeing747.passengerCapacity} человек")
}