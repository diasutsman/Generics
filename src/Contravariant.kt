/*
Contravariant artinya kita bisa melakukan subtitusi supertype dengan subtype
tidak semua jenis class generic yang mendukung contravariant, hanya kelas yang
menggunakan generic parameter function
*/

// subtype = supertype
// e.g
// val data1 : Contravariant<Any> = Contravariant()
// val data2 : Contravariant<String> = data1
//                          subtype    supertype

class Contravariant<in T> {

    fun sayHello(name: T) {
        println("Hello $name")
    }
}

fun main() {
    val data1 : Contravariant<Any> = Contravariant()
    val data2 : Contravariant<String> = data1
}