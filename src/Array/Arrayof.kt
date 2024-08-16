fun main() {
    val array = arrayOf(1, 2, 3)
    println(array.joinToString())
    var arrayOfNull: Array<String?> = arrayOfNulls(5)
    arrayOfNull[0] = "a"
    arrayOfNull[1] = "b"
    println(arrayOfNull.joinToString())
    println("============")
    Greeting("chhunyeang")
    Greeting(null)
}
fun Greeting(name: String?) {
    var message = if (name != null) {
        print("Hello $name")
    } else {
        print("Hello guest")
    }
    println(message)
}