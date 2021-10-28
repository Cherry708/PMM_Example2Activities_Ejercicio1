package com.example.pmm_example2activities_ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{

            val editText = findViewById<EditText>(R.id.editTextName)
            val name = editText.text.toString()

            val intent = Intent(this, GreetingActivity::class.java)
            /*
            Se asigna como extra una clave y un valor, en la otra actividad recogeremos
            el valor mediante esta clave
             */
            intent.putExtra("name", name)

            startActivity(intent)
        }
    }
}