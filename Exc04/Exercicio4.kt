package ListaExercicios02.Exc04

class Exercicio4 {
    fun main(){
        val tripe = Tripe(true, 5.0f, 1.0f, 1.0f)

        println(tripe.prontoParaUsar())
        tripe.usar()
        println(tripe.prontoParaUsar())

        tripe.dobrar()
        tripe.dobrar()

        println(tripe.prontoParaguardar())
        tripe.guardar()
        println(tripe.prontoParaguardar())

        tripe.definirAltura(3.9f)
        println(tripe.alturaAtual)
    }
}