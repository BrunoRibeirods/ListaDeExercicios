package ListaExercicios02.Exc02

class Exercicio02 {
    fun main() {
        val jogador1 = JogadorDeFutebol("Gilberto", 80, 50, 15, 25)
        val jogador2 = JogadorDeFutebol("Rogerio", 70, 80, 130, 80)

        val sessaoDeTreinamento1 = SessaoDeTreinamento()
        val sessaoDeTreinamento2 = SessaoDeTreinamento()

        sessaoDeTreinamento1.treinarA(jogador1)
        sessaoDeTreinamento2.treinarA(jogador2)

    }

}
