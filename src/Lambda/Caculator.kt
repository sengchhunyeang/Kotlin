package Lambda
fun operatorOnNumber(a:Int,b:Int,operation: (Int,Int)->Int):Int{
    return operation(a,b)
}
val testing={a:Int,b:Int->a+b}
fun main(){
   val sub = operatorOnNumber(4,2, operation = {a,b -> a - b})
   val  sum = operatorOnNumber(4,2, operation = {a,b -> a + b})
   val mul = operatorOnNumber(4,2, operation = {a,b -> a * b})
   val div = operatorOnNumber(4,2, operation = {a,b -> a / b})
    println(sum)
    println(sub)
    println(mul)
    println(div)

}
