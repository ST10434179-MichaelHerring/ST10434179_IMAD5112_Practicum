package com.example.st10434179_imad5112_practicum

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailScreen : AppCompatActivity() {

    private lateinit var txtOutput: TextView
    private lateinit var AverageTemp: TextView
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.detail_screen)

        txtOutput = findViewById<TextView>(R.id.txtOutput)
        AverageTemp = findViewById<TextView>(R.id.txtAverageTemp)

        btnBack = findViewById<Button>(R.id.btnBack)

        val days = intent.getStringArrayListExtra("days") ?: arrayListOf()
        val minTemps = intent.getIntegerArrayListExtra("minTemps") ?: arrayListOf()
        val maxTemps = intent.getIntegerArrayListExtra("maxTemps") ?: arrayListOf()
        val allWeatherConditions = intent.getStringArrayListExtra("allWeatherConditions") ?: arrayListOf()

        val displayOutput = StringBuilder()



        for (i in days.indices) {
            displayOutput.append("Day: ${days[i]}, Minimum Temperature: ${minTemps[i]}, Maximum Temperature: ${maxTemps[i]}, Weather Condition: ${allWeatherConditions[i]}\n")
            val averageTemperature = (minTemps[i] + maxTemps[i]) / days.size
        }

        txtOutput.text = displayOutput.toString()
        AverageTemp.text = "Average Temperature: $AverageTemp degrees"

        btnBack.setOnClickListener {
            finish()
        }

    }

}