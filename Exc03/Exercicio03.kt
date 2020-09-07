package ListaExercicios02.Exc03

class Exercicio03 {
    fun main(){
        val atleta1 = Atleta("Adriano", 6, 80)
        val atleta2 = Atleta("Geronimo", 8, 65)

        val prova1 = Prova(6, 75)
        val prova2 = Prova(7, 90)
        val prova3 = Prova(5, 50)

        println("Atleta 1: ${atleta1.nome}")
        println(prova1.podeRealizar(atleta1))
        println(prova2.podeRealizar(atleta1))
        println(prova3.podeRealizar(atleta1))
        println("\n")

        println("Atleta 2: ${atleta2.nome}")
        println(prova1.podeRealizar(atleta2))
        println(prova2.podeRealizar(atleta2))
        println(prova3.podeRealizar(atleta2))

    }
}