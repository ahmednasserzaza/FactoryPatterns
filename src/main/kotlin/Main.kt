import pizza.Pizza
import store.ChicagoPizzaStore
import store.NYPizzaStore
import store.PizzaStore

fun main() {
    val nyStore: PizzaStore = NYPizzaStore()
    val chicagoStore: PizzaStore = ChicagoPizzaStore()

    var pizza: Pizza = nyStore.orderPizza("cheese")
    println("Ahmed ordered a $pizza\n")

    println("===========================================================")

    pizza = chicagoStore.orderPizza("cheese")
    println("Mustafa ordered a $pizza\n")

    println("===========================================================")

    pizza = nyStore.orderPizza("clam")
    println("Mohamed ordered a $pizza\n")

    println("===========================================================")

    pizza = chicagoStore.orderPizza("clam")
    println("Asia ordered a $pizza\n")

    println("===========================================================")

    pizza = nyStore.orderPizza("pepperoni")
    println("Aziza ordered a $pizza\n")

    println("===========================================================")

    pizza = chicagoStore.orderPizza("pepperoni")
    println("Nour ordered a $pizza\n")

    println("===========================================================")

    pizza = nyStore.orderPizza("veggie")
    println("Nasser ordered a $pizza\n")

    println("===========================================================")

    pizza = chicagoStore.orderPizza("veggie")
    println("Ibrahim ordered a $pizza\n")

}