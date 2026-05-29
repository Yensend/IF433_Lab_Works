package oop_00000121040_YensenSiow.week14

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
}

class PremiumPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.80
}

class FinalOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricing: PricingStrategy) {
        val finalPrice = pricing.calculate(basePrice)
        val order = Order(itemName, finalPrice, pricing::class.simpleName ?: "Unknown")

        println("[FinalOrderProcessor] Memproses pesanan '${order.itemName}' seharga $finalPrice")
        repo.saveOrder(order)
        notifier.sendNotification(order)
    }
}

fun main() {
    val repo      = CsvOrderRepository("orders.csv")
    val notifier  = EmailNotifier()
    val processor = FinalOrderProcessor(repo, notifier)

    // Pelanggan reguler
    processor.processOrder("Sepatu Lari", 500_000.0, RegularPricing())

    // Pelanggan VIP (diskon 10%)
    processor.processOrder("Jaket Kulit", 1_200_000.0, VipPricing())

    // Pelanggan Premium (diskon 20%) — ditambah TANPA menyentuh FinalOrderProcessor
    processor.processOrder("Smartwatch", 2_000_000.0, PremiumPricing())
}