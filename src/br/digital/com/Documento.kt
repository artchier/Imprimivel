package br.digital.com

class Documento(override var nome: String) : Imprimivel {

    override var tipoDocumento: String = "documento"
    override fun imprimir(){
        println("Eu sou um documento $nome.$tipoDocumento")
    }
}