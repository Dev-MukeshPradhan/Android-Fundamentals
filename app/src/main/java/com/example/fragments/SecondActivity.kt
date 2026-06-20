package com.example.fragments

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var tvResult: TextView
    lateinit var etName: EditText
    lateinit var etAge: EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        tvResult=findViewById<TextView>(R.id.tvResult)
        etName=findViewById<EditText>(R.id.etName)
        etAge=findViewById<EditText>(R.id.etAge)
        button=findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString()
            tvResult.text = "Name: ${etName.text} Age: ${etAge.text}"

        }


    }
}