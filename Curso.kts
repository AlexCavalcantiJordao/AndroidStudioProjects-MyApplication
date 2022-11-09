package br.com.thiengo.palindromo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.com.thiengo.palindromo.domain.Palindromo
import br.com.thiengo.palindromo.domain.PalindromoK

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btVerificar: Button = findViewById(R.id.bt_verificar) as Button
        btVerificar.setOnClickListener(this)
    }

    @Override
    fun onClick(view: View?) {
        val etPalindromo: EditText = findViewById(R.id.et_palindromo) as EditText
        val tvResposta: TextView = findViewById(R.id.tv_resposta) as TextView
        //Palindromo palindromo = new Palindromo( etPalindromo.getText().toString() );
        val palindromo = PalindromoK(etPalindromo.getText().toString())
        var resposta: String
        resposta = if (palindromo.ehPalindromo()) {
            " é um palíndromo"
        } else {
            " NÃO é um palíndromo"
        }
        resposta = palindromo.getConteudo() + resposta
        tvResposta.setText(resposta)
    }
}