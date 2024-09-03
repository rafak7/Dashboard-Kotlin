package com.example.dashboardclientes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddClientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_client)

        val clientNameEditText = findViewById<EditText>(R.id.clientNameEditText)
        val clientEmailEditText = findViewById<EditText>(R.id.clientEmailEditText)
        val saveClientButton = findViewById<Button>(R.id.saveClientButton)

        saveClientButton.setOnClickListener {
            val clientName = clientNameEditText.text.toString()
            val clientEmail = clientEmailEditText.text.toString()

            if (clientName.isNotEmpty() && clientEmail.isNotEmpty()) {
                // Adiciona o cliente à lista global
                ClientData.clients.add(Client(clientName, clientEmail))

                // Exemplo de feedback ao usuário
                Toast.makeText(this, "Cliente salvo com sucesso!", Toast.LENGTH_SHORT).show()

                // Redireciona para a tela de visualização de todos os clientes
                val intent = Intent(this, ClientListActivity::class.java)
                startActivity(intent)
                finish() // Finaliza a AddClientActivity para que o usuário não possa voltar para ela com o botão de voltar
            } else {
                Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
