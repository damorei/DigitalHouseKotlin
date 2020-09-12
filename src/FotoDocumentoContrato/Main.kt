package FotoDocumentoContrato

fun main(){
    val documento = Documento("Trabalho Escolar","Word")
    val foto = Foto("Foto","JPEG")
    val contrato = Contrato("Locação","PDF")
    val listaImprimivel = mutableListOf<Imprimivel>()

    listaImprimivel.add(foto)
    listaImprimivel.add(contrato)
    listaImprimivel.add(documento)

    val impressora = Impressora(listaImprimivel)
    impressora.pegarImprimivel()
    impressora.imprimirTudo()

}