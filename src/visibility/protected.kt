package visibility

open class SuperClass {
    protected var age: Int = 34
}

open class SubClass : SuperClass() {
    fun printAge(): Int {
        println(age)
        return age
    }
}

fun main() {
    SubClass().printAge()
}