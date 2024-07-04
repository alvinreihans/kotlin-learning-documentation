package com.example.siapaaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val scoreboard = findViewById<ImageView>(R.id.scoreboard)
        scoreboard.setOnClickListener {
            val intent = Intent(this, Scoreboard::class.java)
            startActivity(intent)
        }
    }
}