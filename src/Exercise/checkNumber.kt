package Exercise

fun main() {
    print("Input your number :\t")
    var valueA: Int = readln().toInt()
    println("========Result========")
    if (valueA % 2 == 0) {
        println(" even number is $valueA")
    }else{
        println(" odd number is $valueA")
    }

}

