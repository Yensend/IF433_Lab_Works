package oop_00000121040_YensenSiow.week07

//fun main(){
//    println("==== test singleton ====")
//    println("status: ${DatabaseManager.connectionStatus}")
//    DatabaseManager.connect()
//
//    println("\n=== test companion object ===")
//    val client = NetworkClient.createClient()
//    client.connect()
//}

//fun main() {
//    println("\n Test regular class")
//    val reg1 = RegularUser("Alice", 22)
//    val reg2 = RegularUser("Alice", 22)
//    println(reg1)
//    println("sama? ${reg1 == reg2}")
//
//    println("\n Test regular class")
//    val data1 = DataUser("Alice", 22)
//    val data2 = DataUser("Alice", 22)
//    println(data1)
//    println("sama? ${data1 == data2}")
//
//    val data3 = data1.copy(age = 23)
//    println("hasil Copy: $data3")
//
//    val(userName, userAge) = data1
//    println("Destructured: $userName berumur $userAge")
//}

//fun main(){
//    println("\n TEST SEALED CLASS")
//    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik")
//
//    val uiMessage = when(response){
//        is ApiResponse.Success -> "Tampilkan: ${response.data}"
//        is ApiResponse.Error -> "Tampilkan: ${response.error}"
//        ApiResponse.Loading -> "Tampilkan Spinner"
//    }
//}
fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()

    println(
        "Starter Weapon: ${starterWeapon.item.name} | " +
                "Damage: ${starterWeapon.item.damage} | " +
                "Durability: ${starterWeapon.durability}"
    )

    val upgradedItem = starterWeapon.item.copy(
        damage = 25
    )

    processEvent(BattleState.SafeZone)

    processEvent(
        BattleState.MonsterEncounter("Goblin Nakal")
    )

    processEvent(
        BattleState.LootDropped(upgradedItem)
    )

    processEvent(
        BattleState.GameOver("Terkena jebakan racun")
    )
}
}