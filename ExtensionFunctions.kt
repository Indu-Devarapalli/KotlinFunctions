package com.example.myapplication

// Extension function on String
fun String.isNumeric(): Boolean {
    return this.all { it.isDigit() }
}

// Extension function to calculate area (custom class)
class Circle5(val radius: Double)
fun Circle5.area(): Double {
    return Math.PI * radius * radius
}

// Extension function using scope function
data class User2(var name: String?, var age: Int)

// ✅ Extension function
fun User2.displayInfo() {
    println("User Info -> Name: $name, Age: $age")
}

fun main() {
    val str1 = "12345"
    val str2 = "abc123"

    println(str1.isNumeric())  // Extension function on String
    println(str2.isNumeric())

    val c = Circle5(5.0)
    println("Area of circle: ${c.area()}") // Uses extension function

   //example 2 extension function in scope function

    val user = User2("Annu", 25)

    // 1. run - Lambda Receiver (`this`)
    val runResult = user.run {
        println("run: $name is $age years old")
        "run result: $name"
    }

    // 2. apply - Lambda Receiver (`this`)
    val appliedUser = user.apply {
        name = "Dinusha"
        age = 25
        println("apply: $name is now $age")
    }

    // 3. with - Lambda Receiver (`this`)
    val withResult = with(user) {
        println("with: $name is $age")
        "with result: $age years"
    }

    // 4. let - Lambda Argument (`it`)
    val letResult = user.name?.let {
        println("Name in uppercase: ${it.uppercase()}")
        println("Length of name: ${it.length}")
        "let result: ${it.uppercase()}, ${it.length}"
    }

    // 5. also - Lambda Argument (`it`)
    val alsoUser = user.also {
        println("also: modifying ${it.name}")
        it.age += 5
    }

    //  Calling extension function
    user.displayInfo()

    println(runResult)
    println("after apply: $appliedUser")
    println(withResult)
    println(letResult)
    println("after also: $alsoUser")
}

