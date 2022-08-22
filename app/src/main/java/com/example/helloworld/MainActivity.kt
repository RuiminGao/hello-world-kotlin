package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCoffee = findViewById<Button>(R.id.btnCoffee)
        val ivFace = findViewById<ImageView>(R.id.ivFace)
        val tvIntro = findViewById<TextView>(R.id.tvIntro)
        ivFace.setImageResource(R.drawable.sad)
        btnCoffee.setOnClickListener {
            Log.v("MainActivity", "btnCoffee is clicked")
            Toast.makeText(this, "THX hope you have a good day XD!", Toast.LENGTH_LONG).show()
            ivFace.setImageResource(R.drawable.happy)
            tvIntro.text = "Coffee ><!!"
        }
    }
}