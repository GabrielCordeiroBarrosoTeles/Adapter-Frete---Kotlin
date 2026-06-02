fun main() {
    val shippingService: ShippingService = ShippingAdapter(LegacyShipping())
    val cost = shippingService.getFreightCost("01310-100", 2.5)
    println("Custo do frete: R$ $cost")
}
