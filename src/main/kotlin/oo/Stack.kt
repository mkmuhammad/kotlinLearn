package oo


fun main() {
    val stack = Stack(1, 2, null, 3, 4)
    for (i in 0 until stack.size()) {
        while (!stack.isEmpty()) {
            println(stack.pop())
        }
    }

    val stack2 = stackOf("hi", "hey", "hello")
    for (i in 0 until stack2.size()){
        println(stack2.pop())
    }
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements) // the * mark separates the vararg into each element cause vararg at runtime is a package not an array of elements
}


// DRY = Don't Repeat Yourself
class Stack<E>(vararg val items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun size(): Int {
        return elements.size
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

}

