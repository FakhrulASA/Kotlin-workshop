package inline_fun

inline fun doSomething(a: Int, crossinline funB: (a: Int, b: Int) -> Int) {
    println(funB.invoke(a, a))
}
inline fun doSomething2(a: Int, noinline funB: (a: Int, b: Int) -> Int, funC: (a: Int, b: Int) -> Int) {
    printLa(funB)
    println(funC.invoke(a, a))
}
fun printLa(funB: (a: Int, b: Int) -> Int) {
    println(funB)
}
fun main() {
    val ab = { a: Int, b: Int -> a + b }
    doSomething(20, ab)
    doSomething2(20, ab,ab)
}