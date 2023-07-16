package store

import pizza.Pizza

abstract class PizzaStore {

    protected abstract fun createPizza(item: String): Pizza

    fun orderPizza(type: String): Pizza {
        val pizza: Pizza = createPizza(type)
        println("--- Making a ${pizza.getPizzaName()} ---")
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
