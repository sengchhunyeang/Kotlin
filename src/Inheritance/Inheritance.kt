package OOP

open class Animal { // superclass
    open fun makeSound() =
        println("Sound Animal")
}
class Cat : Animal() { //subclass 1
    override fun makeSound() =
        println("Cat mav mav ")
}
class Duck : Animal() { // subclass 2
    override fun makeSound() =
        println("Duck kak kak ")
}

fun main() {
    Cat().makeSound()
    Duck().makeSound()
}

open class A {
    // ...
}

open class B : A() {
    // ...
}

class C : B() {
    // ...
}