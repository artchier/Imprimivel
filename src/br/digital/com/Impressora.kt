package br.digital.com

class Impressora {

    var listaImprimivel = mutableListOf<Imprimivel>()

//    fun adicionaImprimivel(imprimivel: Imprimivel){ //adiciona um item por vez
//        listaImprimivel.add(imprimivel)
//    }

    fun adicionaImprimivel(vararg itens: Imprimivel){ // adiciona todos os itens de uma vez
        listaImprimivel.addAll(itens)
    }

    fun imprimeTudo(){
        for(imprimivel in listaImprimivel){
            imprimivel.imprimir()
        }
    }
}