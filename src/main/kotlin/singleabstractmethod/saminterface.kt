package singleabstractmethod

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}
fun interface PrintValue{
    fun printVal(a:String) : String
}
val isEven = IntPredicate {
    it % 2 == 0
}
val doPrint = PrintValue {
    it
}
fun main() {
    println("Print value - ${doPrint.printVal("faa")}")
}
