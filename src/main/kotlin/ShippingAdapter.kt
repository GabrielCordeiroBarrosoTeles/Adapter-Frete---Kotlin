class ShippingAdapter(private val legacy: LegacyShipping) : ShippingService {
    override fun getFreightCost(zipCode: String, weight: Double): Double =
        legacy.calculateShipping(zipCode, weight)
}
