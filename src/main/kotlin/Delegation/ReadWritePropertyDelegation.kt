package Delegation
import kotlin.reflect.KProperty

import kotlin.properties.ReadWriteProperty

fun resourceDelegate(): ReadWriteProperty<Any?, Int> =
    object : ReadWriteProperty<Any?, Int> {
        var curValue = 0
        override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
            println("Returning current value $curValue")
            return curValue
        }
        override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
            curValue = value
            println("Setting current value to $curValue")
        }
    }

fun main(){
    val readOnly: Int by resourceDelegate()  // ReadWriteProperty as val
    var readWrite: Int by resourceDelegate()

    readWrite = 20 //setting
    println(readWrite) //getting
}
