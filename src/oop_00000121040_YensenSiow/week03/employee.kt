package oop_00000121040_YensenSiow.week03

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