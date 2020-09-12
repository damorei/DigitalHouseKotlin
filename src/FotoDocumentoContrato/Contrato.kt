package FotoDocumentoContrato

class Contrato(override var nome: String, override var tipoDeDocumento: String) :Imprimivel{
    override fun imprimir() {
        println ("Eu sou um $tipoDeDocumento")
    }
}