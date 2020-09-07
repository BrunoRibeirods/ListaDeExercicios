package ListaExercicios02.Exc03

class Prova(private var dificuldade: Int, var energiaNecessaria: Int) {

    fun podeRealizar(atleta: Atleta): Boolean{
        return (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria)
    }
}