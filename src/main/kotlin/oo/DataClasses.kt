package oo

fun main() {
    val book1 = Book("Super Book", "John Doe", 2020, 99.99)
    val book2 = Book("Super Book", "John Doe", 2020, 99.99)



    val dataBook1 = dataBook("Super Book", "John Doe", 2020, 99.99)
    val dataBook2 = dataBook("Super Book", "John Doe", 2020, 99.99)
    val dataBook3 = dataBook1.copy(price= 77.77)

    val(myTitle, myAuthor, myPublicationYear, myPrice) =dataBook1


    println(book1)
    println(dataBook1)
    println(dataBook3)

    println("decomposing: $myTitle, $myAuthor, $myPublicationYear, $myPrice")
    val set1 = hashSetOf(dataBook1,dataBook2,dataBook3) //since dataBook1 & 2 are equal, it only add one to set
    val set2 = hashSetOf(book1, book2) //it accept duplicated cause it's not a data class
    println("data class set:: $set1")
    println("non-data class set:: $set2")

    println("COMPARING+++++++++++")
    println(book1 == book2)
    println(dataBook1 == dataBook2)
}

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {
    override fun toString(): String {
        return "$title $author $publicationYear $price"
    }
}

data class dataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

