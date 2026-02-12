package oop_00000121040_YensenSiow.week01

fun main (){
    val gameTitle = "Red Dead Redemtion 2"
    val price = 900000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        (price * 0.8).toInt()
    } else { (price * 0.9).toInt()
}