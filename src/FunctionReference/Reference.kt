package FunctionReference

fun sum(a: Int, b: Int): Int {
    return a + b
}
fun main(){
    val funcReference:(Int,Int)->Int=::sum
    println(funcReference(2,3))
}
