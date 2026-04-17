package oop_00000121040_YensenSiow.week06

//fun processCheckout(method: PaymentMethod, amount: Double){
//    println("--> memulai checkout...")
//    method.pay(amount)
//}
//
//fun main(){
//    val myWatch = Smartwatch()
//    myWatch.showTime()
//
//    val myPhone = Smartphone()
//    myPhone.turnOn()
//
//    val pay1 = Gopay()
//    val pay2 = CreditCard()
//
//    println("\n === TESTING CHECKOUT ===")
//    processCheckout(pay1, 50000)
//    processCheckout(pay2, 150000)
//}

fun main() {

    val lamp = SmartLamp("L1", "Ruang Tamu")
    val speaker = SmartSpeaker("S1", "Google Nest Dapur")
    val cctv = SmartCCTV("C1", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== Activate Security Mode ===")
    hub.activateSecurityMode()

    println("\n=== Turn Off All Devices ===")
    hub.turnOffAllSwitches()
}