import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("\n⚔️ $name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        this.hp -= damage
        if (this.hp < 0) {
            this.hp = 0
        }
    }

    fun isAlive(): Boolean {
        return this.hp > 0
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== WELCOME TO KOTLIN BATTLE ARENA ===")
    print("Masukkan Nama Hero: ")
    val inputName = scanner.nextLine()
    print("Masukkan Base Damage: ")
    val inputDamage = scanner.nextInt()

    val myHero = Hero(inputName, inputDamage)
    var enemyHp = 100

    println("\n--- PERTARUNGAN DIMULAI ---")
    println("Musuh (Monster) muncul dengan 100 HP!")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n==============================")
        println("STATUS: ${myHero.name} (HP: ${myHero.hp}) | Musuh (HP: $enemyHp)")
        println("Menu: 1. Serang | 2. Kabur")
        print("Pilih aksi: ")

        val choice = scanner.nextInt()

        if (choice == 1) {

            myHero.attack("Monster")
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println(">> Monster terkena ${myHero.baseDamage} damage. Sisa HP: $enemyHp")

            if (enemyHp > 0) {
                val enemyDmg = (10..20).random()
                println(">> Monster menyerang balik!")
                myHero.takeDamage(enemyDmg)
                println(">> ${myHero.name} terkena $enemyDmg damage. Sisa HP: ${myHero.hp}")
            }
        } else if (choice == 2) {
            println("\n🏃 ${myHero.name} memilih untuk kabur! Pertarungan dibatalkan.")
            break
        } else {
            println("Pilihan tidak valid, kamu membuang-buang waktu!")
        }
    }

    println("\n--- GAME OVER ---")
    if (enemyHp <= 0) {
        println("VICTORY! ${myHero.name} berhasil mengalahkan Monster!")
    } else if (!myHero.isAlive()) {
        println("DEFEAT... ${myHero.name} telah tumbang di medan perang.")
    } else {
        println("STATUS: Kamu berhasil melarikan diri.")
    }
}