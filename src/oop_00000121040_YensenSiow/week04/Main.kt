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

    println("\n-- test car --")
    val myEv = ElectricCar(brand = "Tesla", numberOfDoors = 2, batteryCapacity = 85)
    myEv.openTrunk()
    myEv.honk()
    myEv.accelerate()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager("Budi", 8000000)
    val developer = Developer("Aris", 6000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
