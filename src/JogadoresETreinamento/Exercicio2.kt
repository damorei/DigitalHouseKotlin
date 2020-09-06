package JogadoresETreinamento

fun main(){
    val Danilo = JogadorDeFutebol("Danilo",50,10,0,2)
    val Bruno = JogadorDeFutebol ("Bruno", 60, 5,0,1)
    val Treino = SessaoDeTreinamento(1)
    Treino.treinarA(Danilo)
    Treino.treinarA(Bruno)
}


