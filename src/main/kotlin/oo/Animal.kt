package oo

open class Animal {
    private var age: Int = 0
        //customize internal setter func
        set(value) {
            field = if (value > 0) {
                value
            } else {
                0
            }
        }

    protected var name = "Sam"
    internal val isDangerous = true

    fun isOld(): Boolean {
        return age > 12
    }


}

class Vertebrate : Animal() {
    fun introduceYourself() {
        println(name /* = this.name */)
    }
}

fun main() {
    val animal = Animal()

}