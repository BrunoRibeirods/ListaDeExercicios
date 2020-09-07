package ListaExercicios02.Exc05

class Exercicio5 {
    fun main(){
        val cliente = Cliente("Bruno", "Ribeiro", 40028922)

        val carro = Veiculo("Fiat", "Uno", 2005, "Vermelho", 85000.0)

        val concessionaria = Concessionaria()

        concessionaria.registrarVenda(cliente, carro, 16500.0)

        concessionaria.registros(cliente)
    }
}