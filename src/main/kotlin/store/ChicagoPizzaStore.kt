package store

import factories.PizzaIngredientFactory
import factories.ChicagoPizzaIngredientFactory
import pizza.*

class ChicagoPizzaStore : PizzaStore() {

    override fun createPizza(item: String): Pizza {
        val ingredientFactory: PizzaIngredientFactory = ChicagoPizzaIngredientFactory()

        return when (item) {
            "cheese" -> {
                val pizza = CheesePizza(ingredientFactory)
                pizza.setPizzaName("Chicago Style Cheese Pizza")
                pizza
            }
            "veggie" -> {
                val pizza = VeggiePizza(ingredientFactory)
                pizza.setPizzaName("Chicago Style Veggie Pizza")
                pizza
            }
            "clam" -> {
                val pizza = ClamPizza(ingredientFactory)
                pizza.setPizzaName("Chicago Style Clam Pizza")
                pizza
            }
            "pepperoni" -> {
                val pizza = PepperoniPizza(ingredientFactory)
                pizza.setPizzaName("Chicago Style Pepperoni Pizza")
                pizza
            }
            else -> throw IllegalArgumentException("Invalid pizza item: $item")
        }
    }
}
