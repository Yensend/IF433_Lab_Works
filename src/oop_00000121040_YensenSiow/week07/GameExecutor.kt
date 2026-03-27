package oop_00000121040_YensenSiow.week07

fun processEvent(event: BattleState) {

    when (event) {

        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Mendapat loot: $name | Damage: $damage | Rarity: $rarity")
        }

        is BattleState.GameOver -> {
            println("Game Over karena: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Player berada di Safe Zone. Aman.")
        }
    }
}