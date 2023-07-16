package pizza

import factories.PizzaIngredientFactory

class CheesePizza(
    private val ingredientFactory: PizzaIngredientFactory,
) : Pizza() {

    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }

}
