package oop_00000121040_YensenSiow.week05

class Admin(nama: String ) : Pegawai(nama){
    override fun bekerja() {
        println("[$nama] sedang dduk di dpan komputer layani administrasi")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiwa")
    }
}