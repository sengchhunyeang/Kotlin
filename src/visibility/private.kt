package visibility

class Person {
    private var name: String = "chhunyeang"
    fun printName() {
        println(name)
    }

    private fun print() {
        println("This is testing private")
    }

    fun display() {
        print()
    }
}

fun main() {
    var person = Person()
    person.printName()
    person.display()
}
