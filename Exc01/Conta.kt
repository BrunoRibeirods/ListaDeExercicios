package ListaExercicios02.Exc01

class Conta(var numero: Int, var saldo: Float, var titular: Cliente) {

    fun deposito(quantiaDinheiro: Float){
        saldo += quantiaDinheiro
        println("Deposito realizado, Novo saldo: $saldo")
    }
    fun saque(quantiaDinheiro: Float){
        if(quantiaDinheiro <= saldo){
            saldo -= quantiaDinheiro
            println("Saque realizado, Novo saldo: $saldo")
        }else{
            println("Saldo insuficiente para saque")}
    }
}