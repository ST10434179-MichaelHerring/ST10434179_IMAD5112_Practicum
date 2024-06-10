package com.example.st10434179_imad5112_practicum

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailScreen : AppCompatActivity() {

    private lateinit var txtOutput: TextView
    private lateinit var averageTemp: TextView
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.detail_screen)

        txtOutput = findViewById(R.id.txtOutput)
        averageTemp = findViewById(R.id.txtAverageTemp)

        btnBack = findViewById(R.id.btnBack)

        val days = intent.getStringArrayListExtra("days") ?: arrayListOf()
        val minTemps = intent.getIntegerArrayListExtra("minTemps") ?: arrayListOf()
        val maxTemps = intent.getIntegerArrayListExtra("maxTemps") ?: arrayListOf()
        val allWeatherConditions = intent.getStringArrayListExtra("allWeatherConditions") ?: arrayListOf()

        val displayOutput = StringBuilder()
        var totalTempForCalc = 0

        for (i in days.indices) {
            displayOutput.append("Day: ${days[i]}\n Min Temperature: ${minTemps[i]}\n Max Temperature: ${maxTemps[i]}\n Weather Condition: ${allWeatherConditions[i]}\n\n")
            totalTempForCalc += minTemps[i] + maxTemps[i]
        }

        val averageTempValue = totalTempForCalc / days.size

        txtOutput.text = displayOutput.toString()
        averageTemp.text = "Average Temperature: $averageTempValue degrees"

        btnBack.setOnClickListener {
            finish()
        }

    }

}