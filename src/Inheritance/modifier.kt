package OOP

class Test{
    fun funTest(){
        val test=Test2()
        test.number3=7
    }
}
open class Test2{
    private var number=2
    protected var number2=3
    public var number3=4
    internal var number4=5
}
class Test3:Test2(){

}
