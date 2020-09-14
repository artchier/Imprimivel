package br.com.digital

fun main(){
    val impressora = Impressora()

    val foto = Foto("selfie")
    val documento = Documento("documento1")
    val contrato = Contrato("contrato1")

//    impressora.adicionaImprimivel(foto)
//    impressora.adicionaImprimivel(documento)
//    impressora.adicionaImprimivel(contrato)

    impressora.adicionaImprimivel(foto, documento, contrato) //pela funcção receber um argumento "varargs",
    // eu posso passar vários objetos separados pela vírgula. eles são passados para posições de um array

    impressora.imprimeTudo()
}