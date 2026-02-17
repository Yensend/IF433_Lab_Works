import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Sistem Pencatatan Peminjaman Buku")

    print("Masukkan Judul Buku   : ")
    val title = scanner.nextLine()
    print("Masukkan Nama Peminjam: ")
    val name = scanner.nextLine()
    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    if (duration < 0) {
        println("! Peringatan: Durasi tidak boleh minus. Otomatis diatur ke 1 hari.")
        duration = 1
    }

    val loanRecord = Loan(title, name, duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul Buku    : ${loanRecord.bookTitle}")
    println("Peminjam      : ${loanRecord.borrower}")
    println("Durasi Pinjam : ${loanRecord.loanDuration} hari")

    val totalFine = loanRecord.calculateFine()
    println("Total Denda   : Rp $totalFine")
}