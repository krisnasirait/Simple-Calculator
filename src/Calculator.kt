class Calculator {
    fun calculator(bilangan1: Int, bilangan2: Int, operasi: String): Int{
        return if(operasi == "+"){
            bilangan1 + bilangan2
        }else if(operasi == "-"){
            bilangan1 - bilangan2
        }else if(operasi == "/"){
            bilangan1 / bilangan2
        }else if(operasi == "*"){
            bilangan1 * bilangan2
        }else{
            -1
        }
    }
}

fun main(){
    val calculator = Calculator()

    print("Masukkan bilangan: ")
    val bilangan1: Int = readLine()?.toInt() ?: 0

    print("Masukkan bilangan selanjutnya: ")
    val bilangan2: Int = readLine()?.toInt() ?: 0

    print("Masukkan operasi yang anda inginkan ( + - / *): ")
    val operasi = readLine() ?: ""
    val hasil = calculator.calculator(bilangan1, bilangan2, operasi)
    print("Hasil : ")
    println(hasil)
}