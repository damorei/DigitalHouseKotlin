package FotoDocumentoContrato

class Foto(override var nome: String, override var tipoDeDocumento: String) :Imprimivel{
    override fun imprimir() {
        println ("Eu sou uma $tipoDeDocumento")
    }
}