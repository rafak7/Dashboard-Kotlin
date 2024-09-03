package com.example.dashboardclientes

data class Client(val name: String, val email: String)

// Lista global para armazenar os clientes temporariamente
object ClientData {
    val clients = mutableListOf<Client>()
}
