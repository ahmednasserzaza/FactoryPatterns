package pizzaStore

import pizzaStyle.newyourk.NYStyleCheesePizza
import pizzaStyle.newyourk.NYStylePepperoniPizza
import pizzaStyle.newyourk.NYStyleVeggiePizza
import pizzaStyle.Pizza

class NyPizzaStore : PizzaStore() {
    override fun createPizza(pizzaType: String): Pizza {
        return when (pizzaType) {
            "Cheese" -> NYStyleCheesePizza()
            "Veggie" -> NYStyleVeggiePizza()
            "Pepperoni" -> NYStylePepperoniPizza()
            else -> throw IllegalArgumentException("Invalid pizza type: $pizzaType")
        }
    }
}