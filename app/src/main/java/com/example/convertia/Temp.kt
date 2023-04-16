package com.example.convertia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.convertia.Result

class Temp : AppCompatActivity() {
    companion object{
        const val KEY="com.example.convertia.KEY"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)
        val input=findViewById<EditText>(R.id.inputtemp)
        val farhen=findViewById<Button>(R.id.btnfarhen)
        val kelvin=findViewById<Button>(R.id.btnkel)

        supportActionBar?.hide()

        farhen.setOnClickListener {
            if (input.text.toString()!=" "&& input.text.toString().toInt()>=0){
                val input1=input.text.toString().toInt()
                val ansfarhen1=input1*1.8
                val ansfar=ansfarhen1+32
                val ans= "$ansfar deg F"
                 val intent=Intent(this,Result::class.java)
                intent.putExtra(KEY,ans)
                startActivity(intent)

            }
            else Toast.makeText(this, "Enter in valid format", Toast.LENGTH_SHORT).show()

            kelvin.setOnClickListener {
                if (input.text.toString()!=" "&& input.text.toString().toInt()>=0){
                    val input1=input.text.toString().toInt()
                    val ansfar=input1+273
                    val ans= "$ansfar K"
                    val intent=Intent(this,Result::class.java)
                    intent.putExtra(KEY,ans)
                    startActivity(intent)

                }
                else Toast.makeText(this, "Enter in valid format", Toast.LENGTH_SHORT).show()
            }}


    }
}