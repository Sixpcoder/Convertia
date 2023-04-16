package com.example.convertia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.convertia.Result

class Volume : AppCompatActivity() {
    companion object{
        const val KEY="com.example.convertia.KEY"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)
        val cal= findViewById<Button>(R.id.btncal)
        val input = findViewById<EditText>(R.id.inputvol)
        cal.setOnClickListener {
            if (input.text.toString()!=" "&& input.text.toString().toInt()!=0)
            {
                val input1 =input.text.toString().toInt()
                val ansml= input1*1000
                val ans= "$ansml ml"
                val intent= Intent(this,Result::class.java)
                intent.putExtra(KEY,ans)
                startActivity(intent)
            }
            else Toast.makeText(this, "Enter in Valid Format", Toast.LENGTH_SHORT).show()
        }




    }
}