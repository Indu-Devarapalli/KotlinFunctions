package com.example.myapplication



fun main() {

    val result = 5 multiply  4  //Standard Library Infix Functions
    println(result)

    val result1 = MathUtil() square 5
    println(result1) //User-Defined Infix Functions

    println(3 divide 7)

    val v1 = Vector(1, 2)
    val v2 = Vector(10, 20)
    println(v1 plus v2)
}
//Standard Library Infix Functions
infix fun Int.multiply(other: Int): Int {
    return this * other
}

//User-Defined Infix Functions
class MathUtil {
    infix fun square(n: Int): Int = n * n
}

infix fun Int.divide(other: Int): Int = this * other

 class Vector(val x: Int, val y: Int) {
    infix fun plus(other: Vector): Vector = Vector(this.x + other.x, this.y + other.y)
}