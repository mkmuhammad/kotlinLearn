package oo

fun main() {
    val course: Course = KotlinCourse()
    course.learn()
    println("--------------------------------------------------")
    val specialCourse  = SpecialKotlinCourse()
    specialCourse.learn()
}

abstract class Course(private val topic: String, private val price: Double) {

    open fun learn() {
        println("learning a $topic Course")
    }
}

open class KotlinCourse() :Course("Kotlin", 999.999), Learnable{
    final override fun learn() {
        super<Learnable>.learn()
        println("one of the first people to learn kotlin")
    }


}
class SpecialKotlinCourse:KotlinCourse(){
}

interface Learnable {
    fun learn(){
        println("Learning...")
    }
}
