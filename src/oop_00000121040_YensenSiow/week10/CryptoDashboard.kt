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

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 50000.0))
    txRepo.add(Transaction("TX002", 120000.0))
    txRepo.add(Transaction("TX003", 75000.0))

    println("=== TRANSACTION HISTORY ===")

    txRepo.getAll().forEach {
        println("Transaction ID: ${it.id}")
        println("Amount: ${it.amount}")
        println()
    }

}