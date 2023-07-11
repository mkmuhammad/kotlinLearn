package oo

fun main() {
    val car: Drivable = Car(Color.BLUE) //using ENUM
//    car.build()
    car.drive()

    val motorCycle = MotorCycle("red")
    motorCycle.drive()
}

interface Drivable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(private val color: Color) : Drivable, Buildable {

    override val timeRequired = 120
    override fun drive() {
        println("driving $color car")
    }

    override fun build() {
        println("build a shiny $color car")
    }
}

class MotorCycle(private val color: String) : Drivable {
    override fun drive() {
        println("driving $color motorCycle")
    }
}
