package HigherOrderFunction

//create function higher-order function
fun operation(a:Int,b:Int,operator:(Int,Int)->Int):Int{
    return operator(a,b)
}

fun main(){
    val result= operation(5,5){a,b->a+b}
    println("result is $result")
    val multiple= operation(5,5,{a,b->a*b})
    println("multiple is $multiple")
}