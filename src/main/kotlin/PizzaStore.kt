abstract class PizzaStore {
    protected abstract fun createPizza(pizzaType: String): Pizza

    fun orderPizza(pizzaType: String): Pizza {
        val pizza: Pizza = createPizza(pizzaType)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}