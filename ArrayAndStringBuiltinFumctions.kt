package com.example.myapplication

fun main() {
    //Array Built-in Functions

    val nums = arrayOf(10, 20, 30)
    println(nums.size)  // size
    println(nums[1])         // index
    println(nums.get(2))     // get(index)
    nums.set(1, 100)
    println(nums[1])         // set(index, value)
    println(nums.first())  // first
    println(nums.last())   // last
    println(nums.contains(20))  // contains(value)
    println(nums.indexOf(100))  // indexOf(value)
    nums.forEach { println(it) } //forEach
    println(nums.sum())         // sum
    println(nums.average())     // average
    println(nums.maxOrNull())   // maxornull
    println(nums.minOrNull())   // minornull

    //String Built-in Function

    val name = "Hello"
    println(name.length)  //Length
    println(name.uppercase())  //uppercase
    println(name.lowercase())  // lowercase
    println(name[0])  //index
    println(name.get(3)) //indexof
    println(name.substring(1, 4)) //substring
    println(name.contains("lin")) //contains(value)
    println(name.startsWith("Ko")) //startsWith()
    println(name.endsWith("in"))  //endsWith()
    println(name.replace("K", "M")) //replace(old, new)

    val line = "apple,banana,grape"
    val fruits = line.split(",")
    println(fruits)  //split

    val Text = "   Kotlin   "
    println(Text.trim())  //trim

    val numStr = "123"
    println(numStr.toInt() + 10)  //.toInt()


}