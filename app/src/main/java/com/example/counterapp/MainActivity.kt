package com.example.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var textViewCounter: TextView
    private lateinit var buttonIncrement: Button
    private lateinit var buttonDecrement: Button // Declare buttonDecrement here

    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewCounter = findViewById(R.id.textViewCounter)
        buttonIncrement = findViewById(R.id.buttonIncrement)
        buttonDecrement = findViewById(R.id.buttonDecrement) // Initialize buttonDecrement

        textViewCounter.text = counter.toString()

        buttonIncrement.setOnClickListener {
            incrementCounter()
        }
    }

    private fun incrementCounter() {
        counter++
        textViewCounter.text = counter.toString()
    }
}