package Function
fun <T> singleTonList(item:T):List<T>{
    return listOf(item)
}
fun main(){
    val listInt= singleTonList(42)
    println("it's store value as number $listInt")
    val listString= singleTonList("Hello world")
    println("it's store value as string $listString")
}
