package oop_00000121040_YensenSiow.week07

object DatabaseManager{
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected"
        println("Database ready")
    }
}