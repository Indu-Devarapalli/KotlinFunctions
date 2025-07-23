package com.example.myapplication

fun main() {
    name()
    greetUser("Annu")
    val app = getAppName()
    println(app)
    val result = multiply(5, 3)
    println(result)
}
    fun name() { //Function with No Parameters and No Return Value
        println("Hello, welcome to Home!")
    }
    fun greetUser(name: String) { //Function with Parameters and No Return
    println("Hello, $name!")
    }

fun getAppName(): String {  //Function with Return Value and No Parameters
    return "Kotlin App"
}

fun multiply(a: Int, b: Int): Int { //Function with Parameters and Return Value
    return a * b
}


