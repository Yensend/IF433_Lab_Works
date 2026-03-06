package oop_00000121040_YensenSiow.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama){
    override fun bekerja() {
        println("Bekerja : [$nama] sedang menyiapkan materi kuliah")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}