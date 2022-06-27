class Calculator {
    fun calculator(bilangan1: Double, bilangan2: Double, operasi: String): Double{
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
    val bilangan1: Double = readLine()?.toDouble() ?: 0.0

    print("Masukkan bilangan selanjutnya: ")
    val bilangan2: Double = readLine()?.toDouble() ?: 0.0

    print("Masukkan operasi yang anda inginkan ( + - / *): ")
    val operasi = readLine() ?: ""
    val hasil = calculator.calculator(bilangan1, bilangan2, operasi)
    print("Hasil : ")
    println(hasil)
}