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
        val pessoa =  = intent.getSerializableExtra("pessoa") as 
        pessoa ? 
        val textMensagem = null
        
        mensagem.text = if (cliente != null){
            getString(R.tela2_texto1,cliente.nome,cliente.codigo)
            
        }else if (pessoa != null) {
            getString(R.string.tela2_texto2, pessoa.nome, pessoa.idade)
        }else {
           getString(R.string.tela2_texto2, nome, idade)


    
}
