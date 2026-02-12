    package oop_00000121040_YensenSiow.week01

    fun main(){
        val radius = 7.0
        val pi = 3.14
        var area = pi * radius * radius

        println("Radius:  $radius, Area:  $area")
        println(checkSize(area))
    }

    fun checkSize(area: Double)=
        if (area > 100) "This is a big circle"
        else "This is a small circle"
