package oop_00000121040_YensenSiow.week14

import java.io.FileWriter
import java.io.BufferedWriter

data class Order(val itemName: String, val finalPrice: Double, val customerType: String)

interface OrderRepository {
    fun saveOrder(order: Order)
}

class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository {
    override fun saveOrder(order: Order) {
        BufferedWriter(FileWriter(filePath, true)).use { writer ->
            writer.write("${order.itemName},${order.finalPrice},${order.customerType}")
            writer.newLine()
        }
        println("[CsvOrderRepository] Pesanan '${order.itemName}' berhasil disimpan ke $filePath")
    }
}

interface NotificationService {
    fun sendNotification(order: Order)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(order: Order) {
        println("[EmailNotifier] Email terkirim: Pesanan '${order.itemName}' Anda telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, finalPrice: Double, customerType: String) {
        val order = Order(itemName, finalPrice, customerType)
        println("[SafeOrderProcessor] Memproses pesanan '${order.itemName}' seharga ${order.finalPrice}")
        repo.saveOrder(order)
        notifier.sendNotification(order)
    }
}