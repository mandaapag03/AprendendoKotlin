package br.com.mandaapag03.beecrowd

fun main(){
    val input = readLine()
    val listaInput = input!!.split(" ")
    val coordenadas: MutableList<Double> = mutableListOf()
    for(c in listaInput){
        coordenadas.add(c.toDouble())
    }

    when{
        (coordenadas[0] > 0.0 && coordenadas[1] > 0.0) -> println("Q1")
        (coordenadas[0] < 0.0 && coordenadas[1] > 0.0) -> println("Q2")
        (coordenadas[0] < 0.0 && coordenadas[1] < 0.0) -> println("Q3")
        (coordenadas[0] > 0.0 && coordenadas[1] < 0.0) -> println("Q4")
        (coordenadas[0] != 0.0  && coordenadas[1] == 0.0) -> println("Eixo X")
        (coordenadas[0] == 0.0 && coordenadas[1] != 0.0) -> println("Eixo Y")

        else -> println("Origem")
    }
}