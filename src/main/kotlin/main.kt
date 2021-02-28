fun main(args: Array<String>) {
    val myCar = Car(name = "A3", brand = "Audi")
    val myECar = ElectricCar(name = "S", brand = "Tesla", batteryLife = 85.0)

    myECar.extendRange(200.0)
    myCar.drive(200.0)
    myECar.drive(200.0)
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
open class Car(val name: String, val brand: String) {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if(amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}

// Sub class, child class of car
class ElectricCar(name: String, brand: String, batteryLife: Double): Car(name, brand) {
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        super.drive(distance)
        println("Drove for $distance KM on electricity")
    }
}