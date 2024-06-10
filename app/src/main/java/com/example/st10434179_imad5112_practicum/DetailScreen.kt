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

        //Retrieving data from previous activity (MainScreen) to be able to use in this activity
        val days = intent.getStringArrayListExtra("days") ?: arrayListOf()
        val minTemps = intent.getIntegerArrayListExtra("minTemps") ?: arrayListOf()
        val maxTemps = intent.getIntegerArrayListExtra("maxTemps") ?: arrayListOf()
        val allWeatherConditions = intent.getStringArrayListExtra("allWeatherConditions") ?: arrayListOf()

        //using stringbuilder to easily manipulate the output
        val displayOutput = StringBuilder()
        //only use is for calculating the average temperature
        var totalTempForCalc = 0

        //for each loop looping for as many entries there are in the array of days, and adding each array entry into the displayOutput string
        for (i in days.indices) {
            displayOutput.append("Day: ${days[i]}\n Min Temperature: ${minTemps[i]} degrees \n Max Temperature: ${maxTemps[i]} degrees \n Weather Condition: ${allWeatherConditions[i]}\n\n")
            totalTempForCalc += minTemps[i] + maxTemps[i]

        }



        val averageTempValue = if (days.isEmpty() || days.size == 1)
            0
        else
            totalTempForCalc / days.size

        //output of the string we just built (results)
        txtOutput.text = displayOutput.toString()

        //output of average temperature
        averageTemp.text = "Average Temperature: $averageTempValue degrees"


        //button to go back to MainScreen
        btnBack.setOnClickListener {
            finish()
        }

    }

}