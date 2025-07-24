package com.example.myapplication

fun main() {

    //Higher Order Function

    val sum = Numbers(10, 5) { x, y -> x + y }
    val product = Numbers(10, 5) { x, y -> x * y }

    println("Sum: $sum")
    println("Product: $product")

    User("Tajmahal") { name ->
        println("Agra is famous for $name!")  // side effect only
    }

    // Lambda returns true if number is even
    val isEven = checkNumber(4) { n ->
        n % 2 == 0  // returns Boolean
    }

    // Lambda returns true if number is odd
    val isOdd = checkNumber(7) { n ->
        n % 2 != 0  // returns Boolean
    }

    println("Is 4 even? $isEven")
    println("Is 7 odd? $isOdd")

     // function
    
    processName("it is going to rain today", ::printWeatherReport)

    val evenReport = generateNumberReport(4, ::checkEvenSentence)
    println(evenReport)
}

fun Numbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// Higher-order function that accepts a lambda which returns Unit
fun User(name: String, action: (String) -> Unit) {
    action(name) // Just executes the lambda
}

// Higher-order function that uses a lambda returning Boolean
fun checkNumber(num: Int, condition: (Int) -> Boolean): Boolean {
    return condition(num)  // Uses returned value
}

// Higher-order function: takes function that returns Unit
fun processName(str: String, action: (String) -> Unit) {
    action(str)
}

// Function to print greeting (returns Unit)
fun printWeatherReport(str: String) {
    println(str)
}

// Higher-order function that takes a function returning String

fun generateNumberReport(number: Int, formatter: (Int) -> String): String {
    return formatter(number)
}

// Function that returns a sentence about whether the number is even
fun checkEvenSentence(num: Int): String {
    return if (num % 2 == 0) {
        "$num is an even number."
    } else {
        "$num is an odd number."
    }
}
