/*
Covariant artinya kita melakukan subtitusi subtype (child) dengan supertype (parent)
tidak semua jenis kelas generic yang mendukung covariant, hanya class generic yang menggunakan
generic parameter type sebagai return type function
untuk kata kuncinya kita menggunakan out
*/

// supertype = subtype
// val data1 : Covariant<String> = Covariant("Dias")
// val data2 : Covariant<Any> = data1
//                    supertype   subtype



class Covariant<out T>(private val data: T) {
    fun data() : T {
        return data
    }
}

fun main() {
    val data1 : Covariant<String> = Covariant("Dias")
    val data2 : Covariant<Any> = data1
}