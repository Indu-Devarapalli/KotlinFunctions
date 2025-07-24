package com.example.myapplication

fun main() {
    //lambda expression

    val add1 = { a: Int, b: Int -> a + b } //with type annotation in lambda expression
    val  add2:(Int,Int)-> Int ={a,b->a+b}  //without type annotation in lambda expression
    println(add1(3, 4))
    println(add2(3, 4))

    //Type Inference in lambda
    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println(multiply(4, 5))

    //Type Declaration

    val divide = { a: Double, b: Double -> a / b }
    println(divide(10.0, 2.0))

    // Lambda with Receiver
    fun String.modify(action: String.() -> String): String {
        return this.action()
    }

    val result = "kotlin".modify {
        // this refers to "kotlin"
        this.uppercase() + " is awesome"
    }
    println(result)

    val isEven = { number: Int ->
        println("Checking number: $number")
        number % 2 == 0  // This is the return value
    }
    println(isEven(4))
}