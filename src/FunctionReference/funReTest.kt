package FunctionReference
fun multiply(a: Int, b: Int): Int {
    return a * b
}
fun main() {
    val multiplyReference: (Int, Int) -> Int = ::multiply //create reference func
    val result = multiplyReference(4, 5)// name function reference called
    println(result) // Output: 20
}


