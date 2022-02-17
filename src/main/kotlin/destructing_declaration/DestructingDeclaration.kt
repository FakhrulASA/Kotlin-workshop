package destructing_declaration

fun main(){
    val (price,name) = Food("Mango",210)
    println("The price of $name is $price Taka BDT")

    /**
     * Creating dv for the foodlist. Where component 1 is the name and componenet 2 is the price
     */
    for (
    (name, price) in foodList()
    ){
        println("The price of $name is $price Taka BDT")
    }

}

fun foodList():MutableList<Food>{
    return  mutableListOf(
        Food("Mango",210),
        Food("Apple",110),
        Food("Orange",310),
        Food("Jack-fruit",240)
    )
}