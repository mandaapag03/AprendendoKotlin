package br.com.mandaapag03.cursoYT

fun main(){
    var tipoDeRota: String = "Jegue" // A_PE, CARRO, ONIBUS, TREM

    // if
    if(tipoDeRota == "A_PE"){
        println("Traçando rota a pé")
    } else if(tipoDeRota == "CARRO"){
        println("Traçando rota de carro")
    }else if(tipoDeRota == "TREM"){
        println("Traçando rota de trem")
    }else if(tipoDeRota == "ONIBUS"){
        println("Traçando rota de ônubus")
    }else{
        println("Traçando outra rota")
    }

    // when (quando)
    when(tipoDeRota){
        "A_PE" -> println("Traçando rota a pé")
        "CARRO" -> println("Traçando rota de carro")
        "TREM" -> println("Traçando rota de trem")
        "ONIBUS" -> println("Traçando rota de ônubus")
        else -> {
            println("Rota não implementada")
        }
    }
}