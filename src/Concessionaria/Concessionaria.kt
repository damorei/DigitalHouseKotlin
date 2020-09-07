package Concessionaria
val registroDeVendas = arrayListOf<Venda>()

class Concessionaria {
    fun registrarVenda (veiculo: Veiculo, cliente: Cliente, valor:Double) {
        val venda = Venda(valor, veiculo, cliente)
        registroDeVendas.plus(venda)
        println("Registrada venda do veiculo ${veiculo.modelo} para o cliente ${cliente.nome} pelo valor de R$ $valor")
    }
}