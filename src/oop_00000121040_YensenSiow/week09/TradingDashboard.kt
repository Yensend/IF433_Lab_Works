package oop_00000121040_YensenSiow.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -10.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 20.0, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 5, 8.0, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 10, -2.5, "OPEN")
    )

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    //checkpoint 18
    println("=== CRYPTO TRADING DASHBOARD ===")

    topPerformersString.forEach {
        println(it)
    }
    //checkpoint 19
    println("\n--- LOSSES ---")
    worstPerformersString.forEach {
        println(it)
    }

    println("\n--- UNIQUE PAIRS ---")
    println(uniquePairs)
}//checkpoint 20