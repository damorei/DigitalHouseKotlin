package Tripe

fun main(){
    val novotripe = Tripe(true,0.30,0.70,0.15)
    novotripe.definirAltura(0.55)
    novotripe.desdobrar()
    println("tripe pronto para guardar? ${novotripe.prontoParaGuardar()}")
    novotripe.guardar()
    println("tripe pronto para usar? ${novotripe.prontoParaUsar()}")
    novotripe.usar()

}