package br.com.mandaapag03.aulas

open class Person constructor(firstName: String){
    private var firstName : String
    init {
        this.firstName = firstName
    }
    override fun toString() : String {
        return "Essa pessoa se chama ${this.firstName}"
    }
}
class Aluno(nome: String): Person(nome){
    val nome : String
    init {
        this.nome = nome
    }

    override fun toString(): String {
        return "Esse aluno se chama ${this.nome}"
    }
}
fun main(){
    val p : Person = Person("Amanda")
    println(p.toString())

    val a : Aluno = Aluno("Gabriel")
    println(a.toString())
}