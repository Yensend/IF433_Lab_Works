package oop_00000121040_YensenSiow.week04

fun main(){
    println("-- test vehicle --")
    val generalVehicle = Vehicle ("sepeda onthle")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n -- test car --")
    val myCar = Car ("toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}
