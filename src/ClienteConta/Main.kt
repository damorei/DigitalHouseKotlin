package ClienteConta

import kotlin.math.roundToLong


fun main(){
    val Danilo = Cliente("Danilo","Moreira")
    val Daiane = Cliente("Daiane", "Moreira")
    val contaDanilo = Conta(1234,10501.10.toBigDecimal(), Danilo)
    val contaDaiane = Conta( 1235, 1051.00.toBigDecimal(), Daiane)
    Danilo.depositar(100.00.toBigDecimal(), contaDanilo)
    Danilo.sacar(50.49.toBigDecimal() ,contaDanilo)
    Daiane.depositar(50.10.toBigDecimal() ,contaDaiane)
    Daiane.sacar(10.15.toBigDecimal(),contaDaiane)
    println("Saldo conta Danilo ${contaDanilo.saldo.toDouble()}")
    println ("Saldo conta Daiane ${contaDaiane.saldo.toDouble()}")


}