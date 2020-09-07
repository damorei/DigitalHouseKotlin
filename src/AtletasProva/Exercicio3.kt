package AtletasProva

fun main(){
    val Danilo = Atleta("Danilo",5,10)
    val Daiane = Atleta("Daiane", 4,15)
    val prova1Danilo = Prova(5,2)
    var prova2Danilo = Prova(6,5)
    val prova3Danilo = Prova(4,10)
    val prova1Daiane = Prova(4,2)
    val prova2Daiane = Prova(5,5)
    val prova3Daiane = Prova(3,10)
    println(prova1Danilo.podeRealizar(Danilo))
    println(prova2Danilo.podeRealizar(Danilo))
    println(prova3Danilo.podeRealizar(Danilo))
    println(prova1Daiane.podeRealizar(Daiane))
    println(prova2Daiane.podeRealizar(Daiane))
    println(prova3Daiane.podeRealizar(Daiane))
}