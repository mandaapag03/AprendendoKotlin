package br.com.mandaapag03.cursoYT

import java.math.BigDecimal

fun main(){
    val precoDosProdutos: Array<BigDecimal> = arrayOf(
        BigDecimal("1.99"),
        BigDecimal("51.47"),
        BigDecimal("5.00"),
        BigDecimal("20.50"),
        BigDecimal("99.99")
    )

    // for
    var precoTotal: BigDecimal = BigDecimal.ZERO
    for(preco in precoDosProdutos){
        precoTotal += preco
    }
    println("For: R$ $precoTotal")
    // while
    var contador = 0
    precoTotal = BigDecimal.ZERO
    while(contador < precoDosProdutos.size){
        precoTotal += precoDosProdutos[contador]
        contador += 1
    }
    println("While: R$ $precoTotal")

    // doWhile
    contador = 0
    precoTotal = BigDecimal.ZERO
    do{
        precoTotal += precoDosProdutos[contador]
        contador += 1
    }while(contador < precoDosProdutos.size)
    println("doWhile: R$ $precoTotal")
}