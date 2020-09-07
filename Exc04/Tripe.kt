package ListaExercicios02.Exc04

class Tripe(var dobrado: Boolean, var alturaMaxima: Float, var alturaMinima: Float, var alturaAtual: Float) {
    fun definirAltura(novaAltura: Float){
        if(novaAltura > alturaMaxima || novaAltura < alturaMinima){
            return println("A altura deve estar entre os parametros")
        }else{
        alturaAtual = novaAltura
        }
    }

    fun dobrar(){
        dobrado = !dobrado
        when(dobrado){
            false -> println("O seu tripé está aberto")
            else -> println("O seu tripé está dobrado")
        }
    }

    fun guardar(){
        dobrado = true
        alturaAtual = alturaMinima
    }

    fun prontoParaguardar(): Boolean{
        return (dobrado && alturaAtual == alturaMinima)
    }

    fun usar(){
        dobrado = false
        alturaAtual = alturaMaxima / 2 + 1
        println("Seu tripé foi aberto e possui uma altura de $alturaAtual cm")
    }

    fun prontoParaUsar(): Boolean{
        return (!dobrado && alturaAtual > alturaMinima)
    }

}