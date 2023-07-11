package oo

class House(val height: Double, val color: String, val price: Int = 500000){

    fun print(){
        println("this is a house of [height=$height, color=$color & price=$price]")
    }
}

fun main() {
    val myHouse = House(4.5, "brown", 200000)
    myHouse.print()
    val redHouse = House(color = "RED", price = 200000, height = 3.4)
    redHouse.print()
    val yellowHouse = House(color = "yellow", height = 3.0)
    yellowHouse.print()

}