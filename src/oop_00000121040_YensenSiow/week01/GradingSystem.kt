package oop_00000121040_YensenSiow.week01

fun main(){
    val name = "John Thor"
    val score = 80

    println("nama : $name, nilai: $score ")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89  -> "B"
        in 70..79  -> "C"
        else -> "D"
    }
    println(" grade kamu : $grade ")
}