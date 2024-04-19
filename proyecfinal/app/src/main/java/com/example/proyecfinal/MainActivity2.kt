package com.example.proyecfinal

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun irAbusqueda(view: View?) {
        val segundo = Intent(this@MainActivity2, MainActivity3::class.java)
        startActivity(segundo)
    }

    fun irAperfil(view: View?) {
        val intentActual = intent
        val correo = intentActual.getStringExtra("correo")
        val contraseña = intentActual.getStringExtra("contraseña")
        val intent = Intent(this@MainActivity2, MainActivity4::class.java)
        intent.putExtra("correo", correo)
        intent.putExtra("contraseña", contraseña)
        startActivity(intent)
    }

    fun irAchat(view: View?) {
        val segundo = Intent(this@MainActivity2, MainActivity5::class.java)
        startActivity(segundo)
    }
}