package com.example.myapplication

data class User(var name: String?, var age: Int)

fun main() {
    val user = User("Alice", 25)

    // 1. run - Lambda Receiver (`this`)
    val runResult = user.run {
        println("run: $name is $age years old")
        "run result: $name"
    }

    // 2. apply - Lambda Receiver (`this`)
    val appliedUser = user.apply {
        name = "Bob"
        age = 30
        println("apply: $name is now $age")
    }

    // 3. with - Lambda Receiver (`this`)
    val withResult = with(user) {
        println("with: $name is $age")
        "with result: $age years"
    }

    // 4. let - Lambda Argument (`it`)
    val letResult =
        user.name?.let {
            println("Name in uppercase: ${it.uppercase()}")
            println("Length of name: ${it.length}")
        "let result: ${it.uppercase()}, ${it.length}"
    }

    // 5. also - Lambda Argument (`it`)
    val alsoUser = user.also {
        println("also: modifying ${it.name}")
        it.age += 5
    }

    println(runResult)
    println("after apply: $appliedUser")
    println(withResult)
    println(letResult)
    println("after also: $alsoUser")
}
