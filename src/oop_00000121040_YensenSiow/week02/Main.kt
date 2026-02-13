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
        print ("masukkan jurusan (enter jika belom tau): ")
        val major = scanner.nextLine()
        val s1 = if (major.isEmpty()){
            Student(name,nim)
        }else {
            print("masukkan ipk awal: ")
            val gpaInput = scanner.nextDouble()
            Student(name, nim, major, gpaInput)
        }

        println("Nama    : ${s1.name}")
        println("Jurusan : ${s1.major}")
        println("IPK     : ${s1.gpa}")
    }
}
