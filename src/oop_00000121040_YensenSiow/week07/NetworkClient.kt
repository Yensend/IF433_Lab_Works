package oop_00000121040_YensenSiow.week07

class NetworkClient private constructor(val url: String){
    fun connect(){
        println("connecting to $url...")
    }
}