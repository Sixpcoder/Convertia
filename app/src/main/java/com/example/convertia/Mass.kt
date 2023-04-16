
package com.example.convertia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.convertia.Result
import com.google.android.material.textfield.TextInputEditText

class Mass : AppCompatActivity() {
    companion object{
        const val KEY ="com.example.convertia.KEY"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mass)
        val input=findViewById<EditText>(R.id.inputmass)
        val grams = findViewById<Button>(R.id.btngrams)
        val ton = findViewById<Button>(R.id.btnton)

        supportActionBar?.hide()

        grams.setOnClickListener {
            if (input.text.toString()!=" "&&input.text.toString().toInt()!=0)
            {
                 val input1=input.text.toString().toInt()
                val gramsans=input1*1000
                val ans = gramsans.toString()+" G"
                val intent= Intent(this,Result::class.java)
                intent.putExtra(KEY,ans)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Enter in valid format", Toast.LENGTH_SHORT).show()
            }

        }
        ton.setOnClickListener {
            if (input.text.toString()!=" "&&input.text.toString().toInt()!=0&&input.text.toString().length>=3)
            {
                val input1=input.text.toString().toInt()
                val tonans=input1/1000
                val ans=tonans.toDouble().toString()+" TON"
                val intent= Intent(this,Result::class.java)
                intent.putExtra(KEY,ans)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Enter in valid format", Toast.LENGTH_SHORT).show()
            }
        }

    }
}