package com.example.basico
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTexto = findViewById<EditText>(R.id.editTexto)
        val button = findViewById<Button>(R.id.buttonToast)
        val buttonTela2 = findViewById<Button>(R.id.buttonTela2)
        val buttonparcel = findViewById<Button>(R.id.buttonParcel)

        button.setOnClickListener{
            val texto = edtTexto.text.toString()
            Toast.makeText(this,texto, Toast.LENGTH_SHORT).show()
        }
        buttonTela2.setOnClickListener{
            val intent = Intent(this,Tela2Activity::class.java)
            intent.putExtra("nome","Bernardo")
            intent.putExtra("idade","2")
            startActivity(intent)
        }
        buttonparcel.setOnClickListener {
            val cliente  = Cliente (1, "Bernardo")
            val intent = Intent (this, Tela2Activity:: class.java)
            intent.putExtra("cliente",cliente)
            startActivity(intent)

        }


    }
}