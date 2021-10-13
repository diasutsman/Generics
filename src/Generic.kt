class Building2<T, U> (val data: T, val secondData: U) {
    fun printData() {
        println("Data is $data, $secondData")
    }
}

fun main() {

    val dataString = Building2("Apaan kek", 12)
    dataString.printData()

    val dataInt = Building2(10, listOf(2,3,2,2))
    dataInt.printData()

    val dataBoolean = Building2(true, setOf(131,23,13,14,24,2,1,1,4,1,25,24,1))
    dataBoolean.printData()

}