package FunctionReference

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
fun add(a: Int, b: Int): Int {
    return a + b
}
fun main() {
    val result = operate(5, 3, ::add) // Using the function reference
    println(result) // Output: 8
}
