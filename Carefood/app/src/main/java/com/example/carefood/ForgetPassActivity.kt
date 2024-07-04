package com.example.carefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import com.example.carefood.onboarding.OnBoaringOneActivity

class ForgetPassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_pass)

        val btnKirim = findViewById<Button>(R.id.button3)
        btnKirim.setOnClickListener {
            val intent = Intent(this, otpActivity::class.java)
            startActivity(intent)
        }

        val btnArr = findViewById<ImageView>(R.id.btnArr)
        btnArr.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}