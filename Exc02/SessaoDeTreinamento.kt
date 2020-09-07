package ListaExercicios02.Exc02

class SessaoDeTreinamento() {

    fun treinarA(jogador: JogadorDeFutebol){
        println("\n --${jogador.nome}-- ")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("Experiencia Anteriror: ${jogador.experiencia}")
        jogador.experiencia += 1
        println("Experiencia Atual: ${jogador.experiencia}")
    }
}