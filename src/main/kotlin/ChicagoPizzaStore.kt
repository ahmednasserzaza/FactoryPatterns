class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(pizzaType: String): Pizza {
        return when (pizzaType) {
            "Cheese" -> ChicagoStyleCheesePizza()
            "Pepperoni" -> ChicagoStylePepperoniPizza()
            else -> throw IllegalArgumentException("Invalid pizza type: $pizzaType")
        }
    }
}