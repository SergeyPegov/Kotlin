interface Passenger {
    val passengerCapacity: Int
}

interface Cargo {
    val cargoCapacity: Int
}

abstract class Aircraft(val aircraftNumber: String, protected val maxFlightRange: Int, protected val fuelCapacity: Int) {
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

class Boeing747(
    aircraftNumber: String,
    maxFlightRange: Int,
    fuelCapacity: Int,
    override val passengerCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, fuelCapacity), Passenger {
    override fun printCh() {
        super.printCh()
        println("Вместимость пассажиров: $passengerCapacity человек")
    }
}

class AirbusA380(
    aircraftNumber: String,
    maxFlightRange: Int,
    fuelCapacity: Int,
    override val passengerCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, fuelCapacity), Passenger {
    override fun printCh() {
        super.printCh()
        println("Вместимость пассажиров: $passengerCapacity человек")
    }
}

class Boeing777F(
    aircraftNumber: String,
    maxFlightRange: Int,
    fuelCapacity: Int,
    override val cargoCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, fuelCapacity), Cargo {
    override fun printCh() {
        super.printCh()
        println("Грузоподъёмность: $cargoCapacity кг")
    }
}

fun main() {
    val aircrafts = mutableListOf<Aircraft>()

    val boeing747 = Boeing747("Boeing-747", 14320, 242470, 524)
    val airbusA380 = AirbusA380("Airbus-A380", 15200, 320000, 853)
    val boeing777F = Boeing777F("Boeing-777F", 9070, 181280, 102010)

    aircrafts.add(boeing747)
    aircrafts.add(airbusA380)
    aircrafts.add(boeing777F)

    var userInput: String
    do {
        println("Введите номер команды:")
        println("1. Показать все самолеты")
        println("2. Показать самолет по номеру")
        println("3. Выход")

        userInput = readLine() ?: "3"

        when (userInput) {
            "1" -> {
                aircrafts.forEach {
                    it.printCh()
                    println("-------------------")
                }
            }
            "2" -> {
                println("Выберите номер самолета:")
                aircrafts.forEachIndexed { index, aircraft ->
                    println("${index + 1}. ${aircraft.aircraftNumber}")
                }
                val aircraftNumber = readLine()?.toIntOrNull()
                if (aircraftNumber != null && aircraftNumber in 1..aircrafts.size) {
                    val aircraft = aircrafts[aircraftNumber - 1]
                    aircraft.printCh()
                } else {
                    println("Некорректный номер самолета")
                }
                println("-------------------")
            }
        }
    } while (userInput != "3")
}
