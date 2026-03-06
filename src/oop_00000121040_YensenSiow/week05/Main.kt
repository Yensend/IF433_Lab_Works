package oop_00000121040_YensenSiow.week05

fun main(){
    val dosen1 = Dosen ("Pak Alex", "0123456")
    val admin1 = Admin ("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai){
        pegawai.bekerja()
        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> terdeteksi admin")
                pegawai.doAdminWork()
            }
        }
        println("---------")
    }

    val math = MathHelper()
    println("--- TEST OVERLOADING ---")
    println("Luas Persegi (sisi 5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (10x5): ${math.hitungLuas(10, 5)}")
    println("Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")

    val wallet = EWallet(50000.0)
    val card = CreditCard(100000.0)

    val paymentList: List<PaymentMethod> = listOf(wallet, card)

    println("--- SISTEM PEMBAYARAN ---")
    for (payment in paymentList) {
        payment.processPayment(75000.0)
    }
}