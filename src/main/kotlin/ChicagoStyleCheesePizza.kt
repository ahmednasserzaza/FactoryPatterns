class ChicagoStyleCheesePizza : Pizza(
    name = "Chicago Style Cheese Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
    toppings = listOf("Shredded Mozzarella Cheese")
) {
    override fun cut() {
        println("Cutting the pizza into square slices")
    }

}