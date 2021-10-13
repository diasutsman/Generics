import org.w3c.dom.Text

/*
Terkadang kita ingin membatasi tipe data yang boleh digunakan di generic parameter type
kita bisa menggunakan contraint di generic parameter type dengan menyebutkan tipe yang di perbolehkan
secara otomatis, tipe data yang bisa gunakan adalah tipe yang kita sudah sebutkan atau kelas kelas turunannya
secara default constraint type untuk parameter type adalah 'Any', sehingga semua tipe data
bisa digunakan
*/

// selama masih turunannya masih bisa

open class Employee

class Manager : Employee()

class VicePresident : Employee()

class Company<T : Employee> (val employee: T)

class HeadOffice

fun main() {
    val data1 = Company(VicePresident())
    val data2 = Company(Manager())
    // val data3 = Company(HeadOffice()) // error karena HeadOffice bukan anak dari Employee
}
