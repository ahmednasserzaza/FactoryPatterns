import java.util.ArrayList

abstract class Pizza(
    private val name: String,
    private val dough: String = "Simple Dough",
    private val sauce: String = "Red Sauce",
    private val toppings: List<String> = ArrayList()
) {

    fun prepare() {
        println("Preparing $name")
        println("Tossing dough... $dough")
        println("Adding sauce...$sauce")
        println("Adding toppings:")
        for (topping in toppings) {
            println(" $topping")
        }
    }

    open fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official PizzaStore box")
    }

    fun getName(): String = name
}
