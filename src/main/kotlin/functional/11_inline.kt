package functional

fun main() {

    modifyString("Kotlin is awful", {it.toUpperCase()} )
}

inline fun modifyString(str: String, operation: (String) -> String ): String {

    return operation(str)
}