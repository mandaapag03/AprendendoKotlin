package br.com.mandaapag03.ACs

import java.text.DecimalFormat

/* 1 - Escrever um programa em Kotlin com uma função que recebe como parâmetros uma
lista de qualquer tipo de objeto e um objeto qualquer X (do mesmo tipo dos objetos da
lista) e retorna a quantidade de vezes que X aparece na lista. */

fun contarX(lista: List<Any>, itemBuscado: Any) : Int{
    var contador = 0
    for(item in lista){
        if(item == itemBuscado){
            contador += 1
        }
    }
    return contador
}

//fun main(){
//    val inteiros = listOf(1,2,3,4,5)
//    val strings = listOf("Amanda", "Marcelo", "Paulo")
//    val booleanos = listOf(true, false, false)
//    val listas = listOf(inteiros, strings, booleanos)
//
//    println(contarX(inteiros, 4))
//    println(contarX(strings, "Claudio"))
//    println(contarX(booleanos, false))
//    println(contarX(listas, listOf(1,2,3,4,5)))
//
//}


/* 2 - Utilizando lambda e funções anônimas, escrever um programa em Kotlin com uma
função encontrarPesoIdeal, a partir da altura de uma pessoa. A função deve ter apenas
uma linha. Utilizar as seguintes expressões: (h == altura): Para homens: 72.7 * h - 58 e
rara mulheres: 62.1 * h - 44.7 */

val encontrarPesoIdeal : (altura: Double, sexo: Char) -> Double =  { altura: Double, sexo: Char -> if (sexo == 'M') 72.7 * altura - 58 else  62.1 * altura - 44.7 }

//fun main() {
//    val df = DecimalFormat("#.##")
//    println("Homem de 1.70 => ${df.format(encontrarPesoIdeal(1.70, 'M'))} Kg")
//    println("Mulher de 1.70 => ${df.format(encontrarPesoIdeal(1.70, 'F'))} Kg")
//    println("Homem de 1.90 => ${df.format(encontrarPesoIdeal(1.90, 'M'))} Kg")
//    println("Mulher de 1.90 => ${df.format(encontrarPesoIdeal(1.90, 'F'))} Kg")
//}