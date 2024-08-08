package OOP

open class Animalss { //superclass
    open fun makeSound() = println("Animal sound")
}

class Dog : Animalss() { // subclass 1
    override fun makeSound() = println("Dog barks: Woof!")
}

class Cats : Animalss() { // subclass 2
    override fun makeSound() = println("Cat meows: Meow!")
}

fun main() {
    Dog().makeSound()
    Cats().makeSound()
}
