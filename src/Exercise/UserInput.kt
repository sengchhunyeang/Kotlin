package Exercise

fun main() {
    print("Input your name :")
    val name = readlnOrNull()
    print("Input your age :")
    var age: Int = Integer.valueOf(readlnOrNull())
    println("==========Your Information==============")
    println("Name   :${name}")
    println("Age    :${age}")
}
