package Exercise

fun main() {
    println("======addition, subtraction, multiplication and division of two numbers=====")
    print("Input value A:")
    val valueA = readln().toDouble()
    print("Input value A:")
    val valueB = readln().toDouble()
    println("===========Result==========")
    println("addition $valueA+$valueB: ${valueA + valueB}")
    println("subtraction $valueA-$valueB: ${valueA - valueB}")
    println("multiple $valueA×$valueB: ${valueA * valueB}")
    println("division $valueA/$valueB: ${valueA / valueB}")
}
