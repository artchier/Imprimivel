package br.digital.com

class Contrato(override var nome: String) : Imprimivel {

    override var tipoDocumento: String = "contrato"
    override fun imprimir(){
        println("Eu sou um contrato muito legal $nome.$tipoDocumento")
    }
}