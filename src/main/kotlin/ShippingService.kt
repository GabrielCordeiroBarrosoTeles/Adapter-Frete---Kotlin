interface ShippingService {
    fun getFreightCost(zipCode: String, weight: Double): Double
}
