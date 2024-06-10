package com.example.st10434179_imad5112_practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.splash_screen)

            val getstartedButton = findViewById<Button>(R.id.btnGetStarted)
            val exitButton = findViewById<Button>(R.id.btnExit)

            getstartedButton.setOnClickListener {
                val intent = Intent(this, MainScreen::class.java)
                startActivity(intent)
                finish()
            }

            exitButton.setOnClickListener {
                finish()
            }


        }
    }

