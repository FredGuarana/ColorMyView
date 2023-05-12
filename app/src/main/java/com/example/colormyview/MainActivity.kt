package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btRed: Button = findViewById(R.id.btRed)

        val btYellow: Button = findViewById(R.id.btYellow)
        val btGreen: Button = findViewById(R.id.btGreen)
        val colorRed = Color.RED
        val colorGreen = Color.GREEN
        val colorYellow = Color.YELLOW
        val tvBox1: TextView = findViewById(R.id.textView1)

        val tvBox2: TextView = findViewById(R.id.textView2)
        val tvBox3: TextView = findViewById(R.id.TextView3)
        val tvBox4: TextView = findViewById(R.id.TextView4)
        val tvBox5: TextView = findViewById(R.id.TextView5)
        var selector:TextView = tvBox1

        btRed.setOnClickListener{
            selector.setBackgroundColor(colorRed)
        }
        btGreen.setOnClickListener{
            selector.setBackgroundColor(colorGreen)
        }

        btYellow.setOnClickListener{
            selector.setBackgroundColor(colorYellow)
        }

        tvBox1.setOnClickListener {
            selector = tvBox1
        }

        tvBox2.setOnClickListener {
            selector = tvBox2
        }

        tvBox3.setOnClickListener {
            selector = tvBox3
        }

        tvBox4.setOnClickListener {
            selector = tvBox4
        }

        tvBox5.setOnClickListener {
            selector = tvBox5
        }

    }
}