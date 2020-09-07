package AtletasProva


class Prova (var dificuldade: Int, var energiaNecessaria: Int) {
   fun podeRealizar( atleta: Atleta): String {
       if (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria){
            atleta.energia -= energiaNecessaria
            return "${atleta.nome} pode realizar a prova"}
       else{
           return "${atleta.nome} não pode realizar a prova"}   }
}