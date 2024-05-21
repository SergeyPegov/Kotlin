interface Passenger {
    val passengerCapacity: Int
}

abstract class Aircraft(protected val aircraftNumber: String, protected val maxFlightRange: Int, protected val fuelCapacity: Int) {
    protected var fuelConsumptionPer100Km: Double = 1200.0
        get() {
            return (fuelCapacity.toDouble() / maxFlightRange) * 100
        }
    open fun printCh() {
        println("Номер воздушного судна: $aircraftNumber")
        println("Максимальная дальность полета: $maxFlightRange км")
        println("Вместимость топливного бака: $fuelCapacity литров")
        println("Расход топлива на 100 км: ${fuelConsumptionPer100Km} литров")
    }
}

class Boeing747
    (aircraftNumber: String,
     maxFlightRange: Int,
     fuelCapacity: Int,
     override val passengerCapacity: Int
            ) : Aircraft(aircraftNumber, maxFlightRange, fuelCapacity), Passenger {
    override fun printCh() {
        super.printCh()
        println("Вместимость пассажиров: $passengerCapacity человек")
    }
}

fun main() {
    val boeing747 = Boeing747("Boeing-747", 14320, 242470, 524)
    boeing747.printCh()
}
