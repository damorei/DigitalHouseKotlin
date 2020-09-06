package ClienteConta

import java.math.BigDecimal
import java.util.*


class Cliente (var nome: String, var sobrenome:String) {
    fun depositar (quantia: BigDecimal, conta:Conta){
        conta.saldo += quantia
        println("Depósito")
        println("Novo Saldo: ${conta.saldo}")
    }

    fun sacar (quantia: BigDecimal, conta:Conta){
        if ( quantia > conta.saldo)
            println("Saldo Insuficiente")
        else
            conta.saldo -= quantia
        println("Saque")
        println("Novo Saldo: ${conta.saldo}")

    }
}