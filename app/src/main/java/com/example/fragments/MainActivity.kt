package com.example.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var tvResult: TextView
    lateinit var etName: EditText
    lateinit var etAge: EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        tvResult=findViewById<TextView>(R.id.tvResult) // Connecting kotlin variables to xml views
        etName=findViewById<EditText>(R.id.etName)
        etAge=findViewById<EditText>(R.id.etAge)
        button=findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString()
            tvResult.text = "Name: ${name} Age: ${age}"
            button.visibility = View.GONE
            val homeFragment = HomeFragment.newInstance("Hello", "cstechtube")
            supportFragmentManager.beginTransaction().add(R.id.home_cointainer,homeFragment).commit()
            val intent = Intent(this, Student_DetailsActivity::class.java)
            startActivity(intent)   // we have different methods like startActivity, startBroadcast, startService etc
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("Main Activity", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main Activity", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main Activity", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main Activity", "onStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main Activity", "onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main Activity", "onDestroy Called")
    }
}