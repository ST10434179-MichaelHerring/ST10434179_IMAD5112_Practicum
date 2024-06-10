package com.example.st10434179_imad5112_practicum

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {


   private val day = ArrayList<String>()
   private val minTemp = ArrayList<Int>()
   private val maxTemp = ArrayList<Int>()
   private val weatherConditions = ArrayList<String>()

    private lateinit var edtDay: EditText
    private lateinit var edtMinTemp: EditText
    private lateinit var edtMaxTemp: EditText
    private lateinit var edtWeatherConditions: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_screen)

        var edtDay = findViewById<EditText>(R.id.edtDay)
        var edtMinTemp = findViewById<EditText>(R.id.edtMinTemp)
        var edtMaxTemp = findViewById<EditText>(R.id.edtMaxTemp)
        var edtWeatherConditions = findViewById<EditText>(R.id.edtWeatherConditions)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnViewDetails = findViewById<Button>(R.id.btnDetails)


        btnClear.setOnClickListener {
            clear()
        }


    }

    private fun addData() {

        val day = edtDay.text.toString()
        val minTemp = edtMinTemp.text.toString().toIntOrNull()
        val maxTemp = edtMaxTemp.text.toString().toIntOrNull()
        val weatherConditions = edtWeatherConditions.text.toString()

        if (day.isNotEmpty() && minTemp != null && maxTemp != null && weatherConditions.isNotEmpty()) {)

    }

    private fun clear() {
        day.clear()
        minTemp.clear()
        maxTemp.clear()
        weatherConditions.clear()

        edtDay.text.clear()
        edtMinTemp.text.clear()
        edtMaxTemp.text.clear()
        edtWeatherConditions.text.clear()

        Toast.makeText(this, "User inputs cleared", Toast.LENGTH_SHORT).show()

    }


    private fun viewDetails() {
    }



}