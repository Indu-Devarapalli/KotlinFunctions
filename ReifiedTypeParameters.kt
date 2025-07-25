package com.example.myapplication


fun main() {
    printIfInstance<String>("Hello") //Refied Type parameter
}

//Refied Type parameter
inline fun <reified T> printIfInstance(value: Any) {

    println("Value '$value' is of type ${T::class.simpleName}")
}

