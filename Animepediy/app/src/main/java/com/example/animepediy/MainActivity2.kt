package com.example.animepediy

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btn: Button
        btn=findViewById(R.id.button)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button59)
        btn1.setOnClickListener{
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }
    }
}