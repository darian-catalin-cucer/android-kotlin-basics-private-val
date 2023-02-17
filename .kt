// Examples of private val in Kotlin
class Person(private val name: String) {
    fun greet() {
        println("Hello, my name is $name")
    }
}

fun main() {
    val person = Person("Alice")
    person.greet()
    // name is not accessible outside of the Person class
    // println(person.name) // <-- this line will not compile
}
