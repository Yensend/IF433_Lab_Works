package oop_00000121040_YensenSiow.week06

interface PaymentMethod{
    fun pay(amount:Double)
}

class Gopay : PaymentMethod{
    override fun pay (amount:Double) {println("processing rp$amount via gopay server")}
}

class CreditCard : PaymentMethod{
    override fun pay(amount:Double) {println("contacting bank for rp$amount")}
}