import java.text.SimpleDateFormat
import java.util.Date
fun main() {
    println("============Write a Kotlin program to display the current date and time.=========")
    val currentDate=Date();
    val dateformat=SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    val formatDate=dateformat.format(currentDate)
    println("this is Current Date and Time : $formatDate ")
}