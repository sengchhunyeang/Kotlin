

// Base Class
open class Animal {
    open fun makeSound() = println("Animal sound")
}
// Interface for flying behavior
interface Flyable {
    fun fly() = println("Flying")
}
interface Walk{
    fun walking()= println("Working")
}
open class Duck : Animal(), Flyable,Walk {
    // Override method from the base class
    override fun makeSound() = println("Duck : kak kak ")
    override fun walking() = println("Duck : walking")
}
open class D:Duck(){

}
class C: D() {
    override fun fly() {
        super.fly()
        print("skhfkajs")
    }
}
fun main(){



    C().fly()
}