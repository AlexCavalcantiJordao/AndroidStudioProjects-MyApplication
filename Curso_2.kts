package br.com.thiengo.palindromo.domain

class Palindromo(private val conteudo: String) {
    fun ehPalindromo(): Boolean {
        val invertido = StringBuilder(conteudo).reverse().toString()
        return invertido.equalsIgnoreCase(conteudo)
    }

    fun getConteudo(): String {
        return conteudo.toLowerCase()
    }

}