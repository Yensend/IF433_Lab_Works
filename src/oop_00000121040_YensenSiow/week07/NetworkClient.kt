package oop_00000121040_YensenSiow.week07

class NetworkClient private constructor(val url: String){

    companion object{
        const val BASE_URL = "https://api.column.ac.id"

        fun createClient(): NetworkClient {
            println("membangun networkclient dengan baseurl : $BASE_URL")
            return NetworkClient("$BASE_URL")
        }
    }

    fun connect(){
        println("connecting to $url...")
    }
}