//secara default, saat kita membuat generic parameter type,
// sifat parameter tersebut adalah invariant
// invariant = tidak boleh substitusi subtype (child) atau supertype (parent)

class Invariant<T>(val data : T)

open class SuperType()

class ChildType1 : SuperType()
class ChildType2 : SuperType()

fun main() {
    val data1: Invariant<String> = Invariant("Dias")
//    val data2: Invariant<Any> = data1

    val vari1 = ChildType1()
    val vari2 = ChildType2()
    val vari3: SuperType = vari1
}
