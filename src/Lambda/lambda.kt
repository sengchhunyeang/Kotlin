package Lambda

import jdk.dynalink.Operation

val sumValue={a:Int,b:Int->a+b}
val multipleValue:(Double,Double)->Double={a,b->a*b}
//fun operatorOnNumber(a:Int,b:Int,operation: (Int,Int)->Int):Int{
//    return operation(a,b)
//}
val multiply={a:Int,b:Int -> a*b}
val printTesting={ println("lambda test") }
fun info(name: String? ):Unit{
    if(name !=null){
        println("Hello $name")
    }else{
        println("Hello there !")
    }
}
fun main(){
    val result= operatorOnNumber(4,5, multiply)
    println("This is result : $result")
    val numbersTesting=result
    println("numbersTesting... $numbersTesting")
    val multiReturn= multipleValue(5.0,4.0)
    println("resultTesting Return  $multiReturn")
    val number1=multiReturn
    println("is working $number1")
    val myName=info("Chhunyeang")
    println(myName)
}