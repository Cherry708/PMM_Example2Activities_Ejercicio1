package com.example.pmm_example2activities_ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val intent = getIntent()
        val b = intent.getExtras()
        
        val name = b?.getString("name")

        val text = findViewById<TextView>(R.id.textViewGreeting)
        val show = "Hello $name"
        text.setText(show)
    }
}