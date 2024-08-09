package visibility

open class Persons(public var name: String, public var age: Int) {
    fun personInfo() {
        println("=====Person Information=====")
        println("Name is $name")
        println("Age is $age")
    }
}
class Employee(name: String, age: Int, public var jobTitle: String) : Persons(name, age) {
    fun employeeTitle() {
        println("=====jobTitle=====")
        println("Name is $name")
        println("Age is $age")
        println("Job Title is $jobTitle")
    }
}
fun main() {
    val person = Persons("Sambath", 9)
    val employee = Employee("Alice", 30, "Developer")
    employee.age = 31
    employee.name = "Alice Johnson"
    employee.jobTitle = "Senior Developer"
    employee.personInfo()
    employee.employeeTitle()
}



