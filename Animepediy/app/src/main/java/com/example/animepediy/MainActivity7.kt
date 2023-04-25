package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        var btn: Button
        btn=findViewById(R.id.button19)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button10)
        btn1.setOnClickListener{
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }
    }
}