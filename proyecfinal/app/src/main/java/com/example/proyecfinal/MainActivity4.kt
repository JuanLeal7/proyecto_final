package com.example.proyecfinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val textViewEmail = findViewById<TextView>(R.id.email)
        val textViewPassword = findViewById<TextView>(R.id.contra)
        val email = intent.getStringExtra("correo")
        val password = intent.getStringExtra("contraseña")
        textViewEmail.text = email
        textViewPassword.text = password
    }

    fun irAinicio(view: View?) {
        val segundo = Intent(this@MainActivity4, MainActivity::class.java)
        startActivity(segundo)
    }
}