package ListaExercicios02.Exc02

class JogadorDeFutebol(var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {
    init {
        println("Nome: $nome")
        println("Gols: $gols")
        println("Experiência: $experiencia \n")
    }

    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols += 1
        println("GOOOOOL!")
    }

    fun correr(){
        energia -= 10
        println("Cansei")
    }


}