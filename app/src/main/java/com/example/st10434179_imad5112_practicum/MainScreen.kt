package com.example.st10434179_imad5112_practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {


   private val days = ArrayList<String>()
   private val minTemps = ArrayList<Int>()
   private val maxTemps = ArrayList<Int>()
   private val allweatherConditions = ArrayList<String>()

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

        btnAdd.setOnClickListener {
            addData()
        }

        btnViewDetails.setOnClickListener {
            val intent = Intent(this, DetailScreen::class.java)
            intent.putStringArrayListExtra("days", days)
            intent.putIntegerArrayListExtra("minTemps", minTemps)
            intent.putIntegerArrayListExtra("maxTemps", maxTemps)
            intent.putStringArrayListExtra("allweatherConditions", allweatherConditions)
            startActivity(intent)
        }
    }

    private fun addData() {

        val day = edtDay.text.toString()
        val minTemp = edtMinTemp.text.toString().toIntOrNull()
        val maxTemp = edtMaxTemp.text.toString().toIntOrNull()
        val weatherConditions = edtWeatherConditions.text.toString()

        if (day.isNotEmpty() && minTemp != null && maxTemp != null && weatherConditions.isNotEmpty()) {
            days.add(day)
            minTemps.add(minTemp)
            maxTemps.add(maxTemp)
            allweatherConditions.add(weatherConditions)

            edtDay.text.clear()
            edtMinTemp.text.clear()
            edtMaxTemp.text.clear()
            edtWeatherConditions.text.clear()

            Toast.makeText(this, "User inputs added", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(this, "Please enter all fields correctly", Toast.LENGTH_SHORT).show()
        }
    }

    private fun clear() {
        days.clear()
        minTemps.clear()
        maxTemps.clear()
        allweatherConditions.clear()

        edtDay.text.clear()
        edtMinTemp.text.clear()
        edtMaxTemp.text.clear()
        edtWeatherConditions.text.clear()

        Toast.makeText(this, "User inputs cleared", Toast.LENGTH_SHORT).show()
    }

}