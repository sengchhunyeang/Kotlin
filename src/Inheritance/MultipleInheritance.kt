package OOP

interface Animals{ // Superclass 1
    fun makeSound(){
        println("Animal Sound")
    }
}
interface Vehicle{ // Superclass 2
    fun drive(){
        println("vehicle is driving")
    }
}
class DogDriving:Animals,Vehicle{ // subclass
    override fun makeSound(){ //override method superclass 1
        println("Dog woo woo ")
    }
    override fun drive(){ //override method superclass 1
        println("Dog driving ")
    }
}
fun main(){
    val dog=DogDriving()
    dog.drive()
    dog.makeSound()
}

