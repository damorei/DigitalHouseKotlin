package Concessionaria

fun main(){
    val clienteDanilo = Cliente("Danilo", "Moreira", "danilosilver@gmail.com")
    val carroA5 = Veiculo("Audi","A5 Sportback 2.0 Ambition", 2014, "Prata", 60000)
    val concessionariaALTA = Concessionaria()
    concessionariaALTA.registrarVenda(carroA5,clienteDanilo, 78000.00)
}