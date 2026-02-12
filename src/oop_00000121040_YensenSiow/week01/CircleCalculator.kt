package oop_00000121040_YensenSiow.week01

fun main(args: Array<String>){
    var radius: Double = 7.0
    var pi: Double = 3.14
    var area: Double = pi * radius * radius

    println("Radius: " + radius + ", Area: " + area)
    checkSize(area)
}

fun checkSize(area: Double){
    if (area > 100){
        println("This is A big Circle")
    }else{
        println("This is A small Circle")
    }
}