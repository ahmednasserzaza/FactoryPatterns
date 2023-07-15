fun main() {

    val simplePizzaFactory = SimplePizzaFactory()
    val pizzaStore = PizzaStore(simplePizzaFactory)

    pizzaStore.orderPizza("Margherita")

    println("===============================================")

    pizzaStore.orderPizza("Pepperoni")
}