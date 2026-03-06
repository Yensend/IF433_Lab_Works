package oop_00000121040_YensenSiow.week05

abstract class PaymentMethod(val name: String) {
    abstract fun processPayment(amount: Double)
}