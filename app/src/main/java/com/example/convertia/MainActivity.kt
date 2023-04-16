package com.example.convertia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val mass= findViewById<CardView>(R.id.cdmass)
        val length= findViewById<CardView>(R.id.cdlength)
        val volume= findViewById<CardView>(R.id.cdvol)
        val time= findViewById<CardView>(R.id.cdtime)

        mass.setOnClickListener {
            val intent = Intent(this,Mass::class.java)
            startActivity(intent)

        }
        length.setOnClickListener {
            val intent = Intent(this,Length::class.java)
            startActivity(intent)

        }
        volume.setOnClickListener {
            val intent = Intent(this,Volume::class.java)
            startActivity(intent)

        }
        time.setOnClickListener {
            val intent = Intent(this,Temp::class.java)
            startActivity(intent)

        }


    }
}