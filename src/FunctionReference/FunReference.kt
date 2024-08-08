package FunctionReference
fun name(name:String){
    println("Your name is $name")
}// regular function
fun main(){
    val createReference:(String)->Unit=::name// Reference function
    createReference("vannak")
}//Your name is vannak