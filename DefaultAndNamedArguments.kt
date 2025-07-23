package com.example.myapplication

fun main(args: Array<String>) {

    //DefaultArguments

    val name_of_player = "Lionel Messi"
    val skill_of_player = "Football"
    val jersey_no_of_player = 10
    player()  // no arguments passing while calling function
    player(name_of_player,skill_of_player) // partial arguments passing while calling function
    player(name_of_player,skill_of_player,jersey_no_of_player)
    player(name= name_of_player,jersey= jersey_no_of_player)  // Named Arguments

}
fun player(name: String="Dhoni",skill: String ="Cricket", jersey: Int = 18){
    println("Name of the player is: $name")
    println("Skill of the player is: $skill")
    println("Jersey no of the player is: $jersey")
}



