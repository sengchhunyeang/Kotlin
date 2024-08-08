package Exercise.Function

fun evenNumber(number: IntArray) {
    for (element in number) {
        if (element % 2 == 0) {
            println(element)
        }
    }
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    evenNumber(numbers)
}