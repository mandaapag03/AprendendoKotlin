package br.com.mandaapag03.cursoYT
fun main() {
    // Array
    var array : Array<Int> = arrayOf(
        1,2,3,4,5,6,7,8,9,10
    )
    // Não é possivel adicionar ou remover valores do array, tem tamanho fixo

    array.set(9, 11) // Altera o valor em determinado índice
    array += arrayOf(12,13,14) // Concatenar arrays cria novo array que une os dois
    println("Array")
    array.forEach { println(it) }

    // Lista
    var lista: List<Int> = listOf<Int>(
        1,2,3,4,5
    )
    lista += listOf<Int>(6,7,8)

    println("Lista")
    iterarSequencia(lista)

    // Array List
    val arrayList = arrayListOf( "a", "b", "c")
    println("Array List")
    iterarSequencia(arrayList)


    // Mutable List
    val mutableList = mutableListOf<Any>(
        1,2,3,"batata"
    )
    mutableList.add("Amanda")
    println("Mutable List")

}

fun iterarSequencia(iterable: Iterable<Any>){
    iterable.forEach { println(it) }
}