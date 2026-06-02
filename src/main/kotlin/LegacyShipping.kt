class LegacyShipping {
    fun calculateShipping(cep: String, weightKg: Double): Double {
        val cost = weightKg * 3.50
        println("LegacyShipping: cep=$cep, peso=${weightKg}kg => R$ $cost")
        return cost
    }
}
