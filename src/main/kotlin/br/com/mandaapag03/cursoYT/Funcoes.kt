package br.com.mandaapag03.cursoYT

import java.math.BigDecimal

fun somarPrecoTotal(listaPrecos: Array<BigDecimal>) : BigDecimal{
    var precoTotal: BigDecimal = BigDecimal.ZERO
    for(preco in listaPrecos){
        precoTotal += preco
    }
    return precoTotal
}

fun main() {
    val precoDosProdutos: Array<BigDecimal> = arrayOf(
        BigDecimal("1.99"),
        BigDecimal("51.47"),
        BigDecimal("5.00"),
        BigDecimal("20.50"),
        BigDecimal("99.99")
    )
    val precoDosProdutos2: Array<BigDecimal> = arrayOf(
        BigDecimal("2.99"),
        BigDecimal("51.47"),
        BigDecimal("5.00"),
        BigDecimal("20.50"),
        BigDecimal("9.99")
    )
    val precoDosProdutos3: Array<BigDecimal> = arrayOf(
        BigDecimal("1.99"),
        BigDecimal("51.47"),
        BigDecimal("5.00"),
        BigDecimal("200.50"),
        BigDecimal("99.99")
    )

    println("R$ ${somarPrecoTotal(precoDosProdutos)}")
    println("R$ ${somarPrecoTotal(precoDosProdutos2)}")
    println("R$ ${somarPrecoTotal(precoDosProdutos3)}")
}