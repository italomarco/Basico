package com.example.basico
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val mensagem = findViewById<TextView>(R.id.textMensagem)
        val nome = intent.getStringExtra("nome")
        val idade = intent.getStringExtra("idade")

        mensagem.text = "Nome: $nome / Idade: $idade"
        val cliente = intent.getParcelableExtra<Cliente>("cliente")
        val textMensagem = null
        mensagem.text = if (cliente != null){
            "Nome:${cliente.nome} / Código:${cliente.codigo}"
        }else{
            "Nome:$nome /Idade: $idade"
        }


    }
}