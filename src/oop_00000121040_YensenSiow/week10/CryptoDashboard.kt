package oop_00000121040_YensenSiow.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 10.5))
    coinRepo.add(Coin("USDT", 2500.0))

    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )

    println("=== CRYPTO DASHBOARD ===")
    println("Status Response: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name}")
        println("Balance: ${it.balance}")
        println()
    }

}