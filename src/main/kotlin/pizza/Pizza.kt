package pizza

import ingredients.*

abstract class Pizza {

    var name: String? = null
    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: Array<Veggies>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    abstract fun prepare()

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official store.PizzaStore box")
    }

    fun getPizzaName(): String? = name

    fun setPizzaName(name: String) {
        this.name = name
    }


    override fun toString(): String {
        val result = StringBuilder()
        result.append("---- $name ----\n")
        result.append("$dough\n")
        result.append("$sauce\n")
        result.append("$cheese\n")
        veggies?.let {
            for (i in veggies!!.indices) {
                result.append(veggies!![i])
                if (i < veggies!!.size - 1) {
                    result.append(", ")
                }
            }
        }
        result.append("\n")
        result.append("$clam\n")
        result.append("$pepperoni\n")
        return result.toString()
    }
}
