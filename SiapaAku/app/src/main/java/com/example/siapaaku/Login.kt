package com.example.siapaaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        val btnRegister = findViewById<ImageView>(R.id.register)
        btnRegister.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
        val btnLogin = findViewById<ImageView>(R.id.login)
        btnLogin.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val btnGoogleLogin = findViewById<ImageView>(R.id.google_login)
        btnGoogleLogin.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}