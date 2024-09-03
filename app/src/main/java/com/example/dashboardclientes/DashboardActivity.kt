package com.example.dashboardclientes

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val addClientButton = findViewById<Button>(R.id.addClientButton)

        addClientButton.setOnClickListener {
            // Redireciona para AddClientActivity ao clicar no botão
            val intent = Intent(this, AddClientActivity::class.java)
            startActivity(intent)
        }
    }

    // Função para logout
    fun logout(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
