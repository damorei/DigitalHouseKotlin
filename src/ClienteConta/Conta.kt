package ClienteConta

import java.math.BigDecimal


class Conta(var numeroDaconta: Int, var saldo: BigDecimal, var titular: Cliente) {
    init {
        println("Conta $numeroDaconta criada para o cliente ${titular.nome} ${titular.sobrenome} com o Saldo ${saldo.toDouble()}")
    }
}
