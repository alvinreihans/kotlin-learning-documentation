package com.example.carefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import com.example.carefood.onboarding.OnBoaringOneActivity

class otpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val btnArr = findViewById<ImageView>(R.id.btnArr)
        btnArr.setOnClickListener {
            val intent = Intent(this, ForgetPassActivity::class.java)
            startActivity(intent)
        }

        val btnKonfirmasi = findViewById<Button>(R.id.button3)
        btnKonfirmasi.setOnClickListener {
            val intent = Intent(this, NewPassActivity::class.java)
            startActivity(intent)
        }
    }
}