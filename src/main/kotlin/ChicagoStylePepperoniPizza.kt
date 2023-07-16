class ChicagoStylePepperoniPizza : Pizza(
    name = "Chicago Style Pepperoni Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
    toppings = listOf("Shredded Mozzarella Cheese", "Pepperoni", "Bell Peppers")
) {
    override fun cut() {
        println("Cutting the pizza into square slices")
    }
}