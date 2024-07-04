package com.example.carefood.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.carefood.LoginActivity
import com.example.carefood.R

class OnBoaringOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_one)

        val selanjutnya = findViewById<Button>(R.id.button)
        selanjutnya.setOnClickListener {
            val intent = Intent(this, OnBoaringTwoActivity::class.java)
            startActivity(intent)
        }

        val lewati = findViewById<TextView>(R.id.textView8)
        lewati.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


    }
}