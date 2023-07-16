fun main() {

    val nyPizzaStore: PizzaStore = NyPizzaStore()
    val cheesePizza = nyPizzaStore.orderPizza("Cheese")
    println("Pizza Name is : ${cheesePizza.getName()}")

    println("===================================")

    val chicagoPizzaStore:PizzaStore = ChicagoPizzaStore()
    val pepperoniPizza = chicagoPizzaStore.orderPizza("Pepperoni")
    println("Pizza Name is : ${pepperoniPizza.getName()}")


}