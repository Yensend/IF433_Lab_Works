package oop_00000121040_YensenSiow.week03

class Employee(val name: String) {

    private var perfomanceRating: Int = 3

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: gaji tidak boleh mines, diset ke kosong")
                field = 0
            } else {
                field = value
            }
        }

    val tax: Double
        get() = salary * 0.1
    // ---------------------------------------

    fun increasePerfomance() {
        perfomanceRating++
        println("kinerja $name meningkat! rating: $perfomanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, rating: $perfomanceRating, pajak: $tax")
    }
}