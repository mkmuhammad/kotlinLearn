package oo

abstract class SomeOtherPerson(open val name: String, open var age: Int) {
    init {
        println("obj was created")
    }

    abstract fun speak()

    fun greet(name: String) {
        println("hello $name! from greeting")
    }

    fun getYearOfBirth(): Int {
        return 2020 - age
    }


}

class SomeOtherStudent(override val name: String, override var age: Int, val studentId: Long) :
    SomeOtherPerson(name, age) {
    fun isIntelligent() = true
    override fun speak() {
        println("hi there i'm student, my name is $name and i'm $age with ID:$studentId")
    }
}

class SomeOtherEmployee(override val name: String, override var age: Int) : SomeOtherPerson(name, age) {
    fun receivePayment() {
        println("received Payment")
    }

    override fun speak() {
        println("hi i'm employee")
    }
}

fun main(args: Array<String>) {
    val person = SomeOtherStudent("Jack", 17, 324235);
    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())
    println("================================")

    val student = SomeOtherStudent("JohnSTU ", 19, 1234556)
    student.speak()
    println(student.isIntelligent())
    println("=================================")

    val employee = SomeOtherEmployee("Mary", 32)
    println(employee.getYearOfBirth())
    employee.speak()
    employee.receivePayment()


}