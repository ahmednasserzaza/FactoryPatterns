package factories

import ingredients.*
import sharedIngredients.*

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ParmesanCheese()
    }

    override fun createVeggies(): Array<Veggies> {
        return arrayOf(Garlic(), Mushroom(), Onion())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }
}