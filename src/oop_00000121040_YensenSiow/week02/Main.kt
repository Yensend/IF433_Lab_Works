package oop_00000121040_YensenSiow.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println(" aplikasi pmb umn")
    print("maskan nama: ")
    val name = scanner.nextLine()

    print ("masukan NIM (wajib 5 karakter) : ")
    val nim = scanner.nextLine()
    scanner.nextLine()

    if (nim.length != 5){
        println("error : pendaftaran dibatalkan. nim harus 5 karakter")

    }else {
        print ("masukkan jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("status: pendaftaran selesai.")
    }
}
