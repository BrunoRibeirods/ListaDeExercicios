package ListaExercicios02.Exc05

class Concessionaria {
    var valorDeVenda = Double
    var veiculoVendido = String
    var cliente = String

    var registro = ArrayList<String>()

    fun registros(cliente: Cliente){
        for ( clientes in registro){
            if (clientes.contains(cliente.nome)) println(clientes) else println("Não cadastrado")
        }
    }

    fun registrarVenda(cliente: Cliente, veiculo: Veiculo, venda: Double) {
        registro.add("O carro ${veiculo.modelo} foi vendido para ${cliente.nome} pelo valor de: $venda")
    }
}