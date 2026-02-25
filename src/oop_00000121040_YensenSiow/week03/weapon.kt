package oop_00000121040_YensenSiow.week03

class Weapon(val name: String) {
    var damage: Int = 0 [cite: 101]
    set(value) {
        if (value < 0) {
            println("Peringatan: Damage tidak boleh negatif! Nilai tetap $field.")
        } else if (value > 1000) {
            field = 1000
        } else {
            field = value
        }
    }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary" [cite: 105]
                damage > 500 -> "Epic"      [cite: 106]
            else -> "Common"            [cite: 107]
        }
}