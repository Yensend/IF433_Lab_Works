package oop_00000121040_YensenSiow.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)