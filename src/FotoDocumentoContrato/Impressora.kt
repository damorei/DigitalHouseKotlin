package FotoDocumentoContrato

class Impressora (val listaImpressao : MutableList<Imprimivel>) {
    fun pegarImprimivel(vararg lista: Imprimivel){
        listaImpressao.addAll(lista)
    }
    fun imprimirTudo(){
        listaImpressao.forEach {it.imprimir()}
        }
    }
