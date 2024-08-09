package DataClass

data class Book(val title:String,val author:String){
    override fun toString():String{
        return "Book: '$title' '$author'"
    }
}
fun main(){
    val book = Book("Book","Yeang")
    println(book)
}