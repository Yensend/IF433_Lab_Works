package oop_00000121040_YensenSiow.week05

class EWallet(var balance: Double) : PaymentMethod("E-Wallet") {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$name] Transaksi Berhasil: Sebesar $amount dipotong. Sisa saldo: $balance")
        } else {
            println("[$name] Transaksi Gagal: Saldo tidak mencukupi!")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$name] Top Up Berhasil! Saldo sekarang: $balance")
    }
}