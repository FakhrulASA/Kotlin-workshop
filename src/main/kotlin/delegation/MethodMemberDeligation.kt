interface Base {
    var value : String
    fun printMessage()
}

/**
 * Base implementation where we will implement the implementation of our interface
 */

class BaseImpl(val x: Int) : Base {
    override var value: String = ""
        get() = "The value is $x "
    override fun printMessage() { print(value) }
}
class BaseImplV2(val x: String) : Base {
    override var value: String = ""
        get() = "The value is $x "
    override fun printMessage() { print(value) }
}

/**
 * Deligate class where we will be able to deliver what we want and we can change it in this class without changing in implementation class
 */
class Derived(private  val b: Base) : Base by b {
    override var value: String = b.value
    override fun printMessage() {
        println(value+"EXCECUTED")

    }
}
class Users(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}
fun main() {
    val b = BaseImpl(10)
    val b2 = BaseImplV2("TEN")
    val derived = Derived(b)
    val derived2 = Derived(b2)
    derived.printMessage()
    derived2.printMessage()
    derived.value = "CHICKEN "
    derived2.value = "CHICKEN "
    derived.printMessage()
    derived2.printMessage()

    val user = Users(mapOf(
        "name" to "John Doe",
        "age"  to 25
    ))
    println(user.name) // Prints "John Doe"
    println(user.age)  // Prints 25
}