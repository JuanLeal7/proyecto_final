package com.example.proyecfinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var usuario: EditText? = null
    private var contrasena: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usuario = findViewById(R.id.usuario)
        contrasena = findViewById(R.id.contrasena)
    }

    fun irASecondActivity(view: View?) {
        val username = usuario!!.text.toString()
        val password = contrasena!!.text.toString()
        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
        } else {

            val intent = Intent(this@MainActivity, MainActivity2::class.java)


            intent.putExtra("correo", username)
            intent.putExtra("contraseña", password)


            startActivity(intent)
        }
    }
}