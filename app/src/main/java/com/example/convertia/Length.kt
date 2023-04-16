package com.example.convertia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.convertia.Result

class Length : AppCompatActivity() {
    companion object{
        const val KEY="com.example.convertia.KEY"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)
        val input =findViewById<EditText>(R.id.etinput)
        val cal =findViewById<Button>(R.id.btncal)

        supportActionBar?.hide()

        cal.setOnClickListener {
         if (input.text.toString()!=" "&& input.text.toString().toInt()!=0) {
             val input1 = input.text.toString().toInt()
             val ansmeter =input1*1000
             val ans= ansmeter.toString()+" m"
             val intent = Intent(this,Result::class.java)
             intent.putExtra(KEY,ans)
             startActivity(intent)
         }
            else Toast.makeText(this, "Enter in valid Format", Toast.LENGTH_SHORT).show()
        }
        }
    }
