package Polymorphism

fun display(age:Int){
println("your age :$age")
}
fun display(name:String){
    println("I am $name")
}
fun calculator(number1:Int,number2:Int):Int{
    return number1 + number2
}
fun calculator(number1:Double,number2:Double):Double{
    return number1+number2
}
fun main(){
    display("chhunyeang")
    display(23)
    display("================")
    val res=calculator(2,3,)
   val result= calculator(2.3,3.4)
    println("Result is $res")
    println("Result is $result")

}