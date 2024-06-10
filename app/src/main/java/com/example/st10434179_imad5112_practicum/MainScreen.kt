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


    //parallel arrays declaration above OnCreate to be able to use in functions
    private val days = ArrayList<String>()
    private val minTemps = ArrayList<Int>()
    private val maxTemps = ArrayList<Int>()
    private val allWeatherConditions = ArrayList<String>()

    //user inputted values declared above OnCreate to be able to use in functions as well
    private lateinit var edtDay: EditText
    private lateinit var edtMinTemp: EditText
    private lateinit var edtMaxTemp: EditText
    private lateinit var edtWeatherConditions: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_screen)

        //initializing variables in the OnCreate
        edtDay = findViewById(R.id.edtDay)
        edtMinTemp = findViewById(R.id.edtMinTemp)
        edtMaxTemp = findViewById(R.id.edtMaxTemp)
        edtWeatherConditions = findViewById(R.id.edtWeatherConditions)

        //button declarations
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnViewDetails = findViewById<Button>(R.id.btnDetails)
        val btnExit = findViewById<Button>(R.id.btnExit2ndScreen)


        //button that clears user inputs and arrays
        btnClear.setOnClickListener {
            clear()
        }

        //button that adds user inputs to arrays
        btnAdd.setOnClickListener {
            addData()
        }

        //button that exits the application
        btnExit.setOnClickListener {
            finish()
        }

        //parsing values so we are able to use them on DetailScreen, this also swaps screens to DetailScreen
        btnViewDetails.setOnClickListener {
            val intent = Intent(this, DetailScreen::class.java)
            intent.putStringArrayListExtra("days", days)
            intent.putIntegerArrayListExtra("minTemps", minTemps)
            intent.putIntegerArrayListExtra("maxTemps", maxTemps)
            intent.putStringArrayListExtra("allWeatherConditions", allWeatherConditions)
            startActivity(intent)
        }
    }

    private fun addData() {

        //declaring the user inputted values so we are able to input them into the arrays
        val day = edtDay.text.toString()
        val minTemp = edtMinTemp.text.toString().toIntOrNull()
        val maxTemp = edtMaxTemp.text.toString().toIntOrNull()
        val weatherConditions = edtWeatherConditions.text.toString()
        var txtErrorM = findViewById<TextView>(R.id.txtErrorM)

        //only adds values if all values are present/entered in
        if (day.isNotEmpty() && minTemp != null && maxTemp != null && weatherConditions.isNotEmpty()) {
            if (minTemp < maxTemp) {
                days.add(day)
                minTemps.add(minTemp)
                maxTemps.add(maxTemp)
                allWeatherConditions.add(weatherConditions)

                //clears the fields once values are added to the parallel arrays
                edtDay.text.clear()
                edtMinTemp.text.clear()
                edtMaxTemp.text.clear()
                edtWeatherConditions.text.clear()

                //toast to show values have been added to arrays
                Toast.makeText(this, "User inputs added", Toast.LENGTH_SHORT).show()
            } else {
                txtErrorM.text = "Minimum temperature must be lower than maximum temperature"
            }
        } else {
                //toast to show values have not been added to arrays
                Toast.makeText(this, "Please enter all fields correctly", Toast.LENGTH_SHORT).show()
            }
        }


    private fun clear() {
        //clears all fields and arrays
        days.clear()
        minTemps.clear()
        maxTemps.clear()
        allWeatherConditions.clear()

        edtDay.text.clear()
        edtMinTemp.text.clear()
        edtMaxTemp.text.clear()
        edtWeatherConditions.text.clear()

        //toast to confirm all user inputs were cleared
        Toast.makeText(this, "User inputs cleared", Toast.LENGTH_SHORT).show()
    }

}