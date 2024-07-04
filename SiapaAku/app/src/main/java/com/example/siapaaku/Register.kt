package com.example.siapaaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<ImageView>(R.id.register)
        btnRegister.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val btnBack = findViewById<ImageView>(R.id.backBtn)
        btnBack.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}