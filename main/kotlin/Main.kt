fun main() {

    //Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

    for(i in 1000..1999 ) {
    if (i %11 ==5) {

      println (i)
  }




    }
    var  p  =  0
    var  im = 0

    for (i in 1..10) {
        println(" Digite um numero")
        var n = readLine()!!.toInt()
        if (n/2==0) {
            p ++

        } else {
            im ++


        }

        println( " Numeros impares $im ")
        println( "Numeros pares $p")
    }

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)



}