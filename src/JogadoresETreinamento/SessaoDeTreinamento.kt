package JogadoresETreinamento

class SessaoDeTreinamento (var experienciaTreinamento: Int) {
    fun treinarA(jogadorTreinando: JogadorDeFutebol)
    {
        println("Experiencia Inicial ${jogadorTreinando.experiencia}")
        jogadorTreinando.correr()
        jogadorTreinando.fazerGol()
        jogadorTreinando.correr()
        jogadorTreinando.experiencia.plus(experienciaTreinamento)
        println("Experiencia após Treinamento ${jogadorTreinando.experiencia}")
    }
}