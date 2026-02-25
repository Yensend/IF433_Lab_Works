fun main() {

    val sword = Weapon("Excalibur")

    sword.damage = -50
    sword.damage = 9999

    println("Weapon : ${sword.name}")
    println("Damage : ${sword.damage}")
    println("Tier   : ${sword.tier}")
}