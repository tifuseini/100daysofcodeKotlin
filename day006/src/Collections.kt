fun main() {
    val mShoppingList = mutableListOf("Tea","Eggs","Milk")

    println("mShoppingList priginal: $mShoppingList")
    val extraShoppingList = listOf("Cookie","Sugar ","Eggs")
    mShoppingList.addAll(extraShoppingList)
    println("mShoppingList items added: $mShoppingList")

    if (mShoppingList.contains("Tea")){
        mShoppingList.set(mShoppingList.indexOf("Tea"),"Coffee")
    }

    println(mShoppingList)
    println("mshopping sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mshopping reversed : $mShoppingList")

}