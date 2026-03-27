package oop_00000121040_YensenSiow.week07

fun main(){
    println("==== test singleton ====")
    println("status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== test companion object ===")
    val client = NetworkClient.createClient()
    client.connect()
}