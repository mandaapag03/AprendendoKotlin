package br.com.mandaapag03.cursoYT

import kotlin.random.Random
import kotlin.system.measureNanoTime

fun main() {
    val map1 = mapOf<Int, String>(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Razoável",
        4 to "Bom",
        5 to "Muito Bom"
        )
    print(map1.get(0))

    val mutableMap2= mutableMapOf(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Razoável",
        4 to "Bom",
        5 to "Muito Bom"
    )
    mutableMap2.put(6, "Do caralho")
    mutableMap2[0] = "Uma merda"
    println(mutableMap2)
//============================================================================================
    val listaCodigos = Array(1000){ Random.nextInt(1, 6) }
    val listMap = listOf(
        Pair(1, "Muito Ruim"),
        Pair(2, "Ruim"),
        Pair(3, "Razoável"),
        Pair(4, "Bom"),
        Pair(5, "Muito Bom")
    )

    // for dentro de for (for > find)
    val performanceFor1 = measureNanoTime {
        for (codigo in listaCodigos){
            val categoria = listMap.find{ it.first == codigo} // retorna o item do map que atende a condição do find
            // it.first -> chave / it.second -> valor
            println(categoria)
        }
    }
    println(performanceFor1)

    // 1 for
    val performanceFor2 = measureNanoTime {
        for (codigo in listaCodigos){
            val categoria = listMap[codigo - 1]
            println(categoria.second)
        }
    }
    println(performanceFor2)
}