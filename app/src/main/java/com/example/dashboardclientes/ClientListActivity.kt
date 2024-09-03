package com.example.dashboardclientes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ClientListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client_list)

        val clientsListView = findViewById<ListView>(R.id.clientsListView)

        // Cria um adaptador para exibir a lista de clientes
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            ClientData.clients.map { "${it.name} - ${it.email}" } // Mostra o nome e email do cliente
        )

        clientsListView.adapter = adapter
    }
}
