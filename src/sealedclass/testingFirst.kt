package sealedclass

import java.lang.Exception

sealed class Result{
    data class Success(val data:String):Result()
    data class Error(val exception: Exception):Result()
}
fun handleResult(result:Result){
    when (result){
        is Result.Success->println("Success : ${result.data}")
        is Result.Error->println("Exception : ${result.exception.message}")
    }
}
fun main() {
    val result=Result.Success("Hello world")
    val error=Result.Error(Exception("Something went wrong"))
    handleResult(result)
    handleResult(error)
}
