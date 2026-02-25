package oop_00000121040_YensenSiow.week03

fun main() {

    val sword = Weapon("Excalibur")

    sword.damage = -50
    sword.damage = 9999

    println("Weapon : ${sword.name}")
    println("Damage : ${sword.damage}")
    println("Tier   : ${sword.tier}")

    println("\n--- Testing Player ---")
    val p = Player("YensenSiow")

    p.addXp(50)
    p.addXp(60)
}