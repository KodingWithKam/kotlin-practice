fun main(args: Array<String>) {
    val myCar = Car(name = "A3", brand = "Audi", maxSpeed = 200.0)
    val myECar = ElectricCar(name = "S", brand = "Tesla", batteryLife = 85.0, maxSpeed = 240.0)

    myECar.extendRange(200.0)
    myCar.drive(200.0)
    myECar.drive(200.0)

    myCar.brake()
    myECar.brake()
}

/*
* INTERFACES
* Interfaces in Kotlin can contain declarations of abstract methods,
* as well as method implementations. What makes them different from
* abstract classes is that interfaces cannot store state.
* They can have properties but these need to be abstract or
* to provide accessor implementations.
* */
interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }
}

/**
 * Open keyword needs to be added to classes that you plan on using for inheritance
 */

// Super class, parent class
open class Vehicle {
    // Properties

    // methods
}

// Sub class, child class of vehicle
// Super class of electric car
open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if(amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }

    override fun drive(): String {
        return "driving the interface"
    }
}

// Sub class, child class of car
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double): Car(maxSpeed, name, brand) {
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        super.drive(distance)
        println("Drove for $distance KM on electricity")
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}