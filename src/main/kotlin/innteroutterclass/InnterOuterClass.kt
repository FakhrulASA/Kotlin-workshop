package innteroutterclass

class Outer {
    private val bar: Int = 1
    inner class Nested {
        fun foo() = 2
    }
}

fun main(){
    var innerclass = Outer().Nested()
    println(innerclass.foo())// == 2)
}