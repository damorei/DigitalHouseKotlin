package Tripe

class Tripe (var dobrado: Boolean, var alturaMinima: Double, var alturaMaxima: Double, var alturaAtual:Double) {
    fun definirAltura (novaAltura: Double){
        alturaAtual = novaAltura
        println("nova altura do tripe é $alturaAtual")
    }

    fun dobrar(){
        dobrado = true
        println ("tripé dobrado")
    }
    fun desdobrar(){
        dobrado = false
        println ("tripé não dobrado")
    }
    fun guardar(){
        dobrar()
        definirAltura(alturaMinima)
        println("tripé guardado")
    }
    fun prontoParaGuardar() :Boolean {
        return dobrado && alturaAtual <= alturaMinima
    }
    fun usar() {
        desdobrar()
        definirAltura( (alturaMaxima/2)+0.01)
        println("tripé em uso")
    }
    fun prontoParaUsar(): Boolean {
        return !dobrado && alturaAtual >= (alturaMinima/2)
    }
}