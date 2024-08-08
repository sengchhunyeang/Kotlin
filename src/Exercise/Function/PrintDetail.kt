package Exercise.Function
fun detail(name:String , age:Int, city:String){
    println("==================Personal==================")
    println("Your name is $name")
    println("Your age is $age")
    println("Your city is $city")
    println("==================exit==================")

}
fun main(){
    print("Enter your name  : ")
    val name= readln()
    print("Enter your  age : ")
    val age= readln().toInt()
    print("Enter your city : ")
    val city= readln()
    detail(name,age,city)
}