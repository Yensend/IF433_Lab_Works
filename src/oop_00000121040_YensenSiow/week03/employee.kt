package oop_00000121040_YensenSiow.week03

private var perfomanceRating: Int = 3

fun increasePerfomance() {
    perfomanceRating++
    println("kinerja $name mengingkat! rating: $perfomanceRating")
}

fun printStatus(){
    println("Karyawan: $name, rating: $perfomanceRating")

}
class Employee(val name: String){
    var salary: Int = 0
        set(value){
           if(value<0){
               println("ERROR: gaji tiidak boleh mines, diset ke kosong")
               field = 0
           }else{
               field = value
           }
        }
}