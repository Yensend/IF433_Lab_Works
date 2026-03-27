package oop_00000121040_YensenSiow.week07

enum class AppState{
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse{
    data class Success(val data: Any): ApiResponse()
    data class Error(val error: String): ApiResponse()
    object Loading: ApiResponse()
}