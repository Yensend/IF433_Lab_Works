package oop_00000121040_YensenSiow.week08

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder. deliveryDetails?.address?.city?.name?:"kota tidak diketahuii"
    println("tujuan pengiriman: $destination")
}