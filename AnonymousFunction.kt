package com.example.myapplication

fun main() {

    //Anonymous function

    val text= fun(name: String): String {
        return "Hello, $name"
    }

    println(text("World"))

    val divide = fun(a: Int, b: Int): Int {  //multiple parameters
        return a / b
    }

    println(divide(5, 3))

    val multiply = fun(x: Int) = x * x // without return
    println(multiply(4))

    //comparing both

    // Lambda to check if a number is odd
    val isOddLambda = { number: Int -> number % 2 != 0 }

    // Anonymous function to check if a number is odd
    val isOddAnon = fun(number: Int): Boolean {
        return number % 2 != 0
    }

    println(isOddLambda(3))
    println(isOddAnon(3))


}