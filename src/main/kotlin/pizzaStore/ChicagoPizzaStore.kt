package pizzaStore

import pizzaStyle.chicago.ChicagoStyleCheesePizza
import pizzaStyle.chicago.ChicagoStylePepperoniPizza
import pizzaStyle.Pizza

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(pizzaType: String): Pizza {
        return when (pizzaType) {
            "Cheese" -> ChicagoStyleCheesePizza()
            "Pepperoni" -> ChicagoStylePepperoniPizza()
            else -> throw IllegalArgumentException("Invalid pizza type: $pizzaType")
        }
    }
}