package oop_00000121040_YensenSiow.week01

fun main (){
    val gameTitle = "Red Dead Redemtion 2"
    val price = 900000
    val finalPrice = calculateDiscount(price)
    val userNote: String? = null
    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        (price * 0.8).toInt()
    } else { (price * 0.9).toInt()
}

fun printReceipt(title: String, finalPrice: Int, note: String?){
    println("nota pembayaran SteamKW")
    println("Judul Game  : $title")
    println("Total Bayar : Rp $finalPrice")
    println("Catatan : ${note ?: "Tidak ada catatan"}")
}