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
}