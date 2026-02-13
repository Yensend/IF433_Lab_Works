package oop_00000121040_YensenSiow.week02

class Student(
    val name: String,
    val nim: String,
    val major: String
){
    init{
        if (nim.length != 5){
            println("warning: objek tercipta dengan NIM ($nim) yang tidak valid")
            println("data mahasiswa $name mungkin akan bermasalah di sistem.")
        }else {
            println("logL objek student $name berhasil dialokasikan di memory.")
        }
    }
}