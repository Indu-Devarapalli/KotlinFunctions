package com.example.myapplication
import kotlin.math.sqrt
import kotlin.math.abs
fun main() {

       //StandardLibraryFunction

        val text = "infinite"
        println(text.uppercase()) //uppercase
        println(text.lowercase())  //lower case
        println(text.length)//length

    val numbers = arrayOf(1, 2, 3)
        println(text[0])     //arrayof
        println(numbers.size)
        println(maxOf(5, 10))  //maxOf()
        println(minOf(5, 10))  //minOf()
        println(sqrt(16.0)) //sqrt()
        println(abs(-10)) //Absolute Value

    val numStr = "123"
    val num = numStr.toInt()  //toInt
    println(num + 10)

}

