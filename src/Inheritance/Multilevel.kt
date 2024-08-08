package Inheritance

open class Animal { // superclass
    open fun makeSound() = println("Sound Animal")}
open class Cat : Animal() { //subclass 1 Cat extend Animal
    override fun makeSound() = println("Cat mav mav ")}
class Duck : Cat() { // subclass 2 Duck extend Animal
    override fun makeSound() = println("Duck kak kak ")}

fun main() {
    Cat().makeSound()
    Duck().makeSound()
}
