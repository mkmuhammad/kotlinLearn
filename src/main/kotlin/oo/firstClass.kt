package oo

class Person(val name: String,var age: Int) {
    var birthYear = 2020 - age

    init {
        println("obj was created")
    }

    fun speak() {
        println("hello from Speak Fun")
    }

    fun greet(name: String) {
        println("hello $name! from greeting")
    }

    fun getYearOfBirth(): Int {
        return 2020 - age
    }

//    fun getYearOfBirth() = 2020 - age

}

fun main(args: Array<String>) {
    val person = Person("Jack", 17);
    println(person.name)
    println(person.age)
    person.age = 20
    println(person.age)
    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())


}