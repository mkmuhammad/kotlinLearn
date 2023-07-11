package oo

open class SomePerson(open val name: String, open var age: Int) {
    init {
        println("obj was created")
    }

    fun speak() {
        println("hello $name from Speak Fun")
    }

    fun greet(name: String) {
        println("hello $name! from greeting")
    }

    fun getYearOfBirth(): Int {
        return 2020 - age
    }


}

class Student(override val name: String, override var age: Int, val studentId: Long) : SomePerson(name, age) {
    fun isIntelligent() = true
}

class Employee(override val name: String, override var age: Int) : SomePerson(name, age) {
    fun receivePayment(){
        println("received Payment")
    }
}

fun main(args: Array<String>) {
    val person = SomePerson("Jack", 17);
    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())
    println("================================")

    val student = Student("JohnSTU ", 19,1234556)
    student.speak()
    println(student.isIntelligent())
    val employee = Employee("Mary", 32)
    println(employee.getYearOfBirth())
    employee.receivePayment()


}