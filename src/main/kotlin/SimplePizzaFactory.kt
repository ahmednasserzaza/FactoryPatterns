class SimplePizzaFactory {

    fun createPizza(type: String): Pizza {
        return when (type) {
            "Margherita" -> MargheritaPizza()
            "Pepperoni" -> PepperoniPizza()
            else -> throw IllegalArgumentException("Invalid pizza type: $type")
        }
    }
}