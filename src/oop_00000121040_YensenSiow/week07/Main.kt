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

fun main() {
    println("\n Test regular class")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("sama? ${reg1 == reg2}")
}
