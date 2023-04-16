package com.example.convertia

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import java.security.Key

class Result : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.hide()

        val cdresult = findViewById<CardView>(R.id.cdresult)
        val result = findViewById<TextView>(R.id.tvresult)


        result.text=intent.getStringExtra(Mass.KEY).toString()

        result.text=intent.getStringExtra(Length.KEY).toString()

        result.text=intent.getStringExtra(Volume.KEY).toString()

        result.text=intent.getStringExtra(Temp.KEY).toString()



    }
}