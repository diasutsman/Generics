class Function(val name: String = "alas") {
    fun <T> sayHello(param: T) {
        println("paramater is $param and my name is $name")
    }
}

fun main() {
    val function = Function()
    function.sayHello(setOf(96,420,96,420,96,420,96,420,96,420,96,420,96,420,96,420))
    function.sayHello(null)
    function.sayHello(1213)
//    function.area("dda", "dad")
}
