package oop_00000121040_YensenSiow.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println(" aplikasi pmb umn")
    print("masukan nama: ")
    val name = scanner.nextLine()

    print("masukan NIM (wajib 5 karakter) : ")
    val nim = scanner.nextLine()
    scanner.nextLine()

    if (nim.length != 5) {
        println("error : pendaftaran dibatalkan. nim harus 5 karakter")

    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()
        if (type == 1) {
            print("masukkan jurusan (enter jika belom tau): ")
            val major = scanner.nextLine()
            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
            println("Status: Pendaftaran selesai.")
        } else if (type == 2) {
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
            println("Status: Pendaftaran selesai.")

        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}

