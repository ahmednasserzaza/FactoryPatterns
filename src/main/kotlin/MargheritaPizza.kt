class MargheritaPizza : Pizza {

    override fun prepare() {
        println("Preparing Margherita Pizza")
    }

    override fun bake() {
        println("Baking Margherita Pizza")
    }

    override fun cut() {
        println("Cutting Margherita Pizza")
    }

    override fun box() {
        println("Boxing Margherita Pizza")
    }
}