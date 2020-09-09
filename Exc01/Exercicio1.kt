package ListaExercicios02.Exc01

class Exercicio1 {
    fun main(){
        val cliente1 = Cliente("Bruno", "Ribeiro")
        val cliente2 = Cliente("Ayrton", "Senna")

        val conta1 = Conta(68092020, 45.000f, cliente1)
        val conta2 = Conta(78092020, 450.000f, cliente2)

        conta1.deposito(55.000f)
        conta2.saque(200.000f)

        conta1.saque(105.000f)
        println(conta1.saldo)
    }
}