package store

import factories.PizzaIngredientFactory
import factories.NYPizzaIngredientFactory
import pizza.*

class NYPizzaStore : PizzaStore() {

    override fun createPizza(item: String): Pizza {
        val ingredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()

        return when (item) {
            "cheese" -> {
                val pizza = CheesePizza(ingredientFactory)
                pizza.setPizzaName("New York Style Cheese pizza.Pizza")
                pizza
            }
            "veggie" -> {
                val pizza = VeggiePizza(ingredientFactory)
                pizza.setPizzaName("New York Style Veggie pizza.Pizza")
                pizza
            }
            "clam" -> {
                val pizza = ClamPizza(ingredientFactory)
                pizza.setPizzaName("New York Style Clam pizza.Pizza")
                pizza
            }
            "pepperoni" -> {
                val pizza = PepperoniPizza(ingredientFactory)
                pizza.setPizzaName("New York Style Pepperoni pizza.Pizza")
                pizza
            }
            else -> throw IllegalArgumentException("Invalid pizza item: $item")
        }
    }
}
