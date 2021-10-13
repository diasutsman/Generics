class Building1(val data: Any)

fun main() {
    val dataString = Building1("Pertamina")
    val valueString: String = dataString.data as String
    println(valueString)

    val dataInt = Building1(1)
    val valueInt = dataInt.data as Int
    println(valueInt.toString())
}