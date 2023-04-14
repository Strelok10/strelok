package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btn: Button
        btn=findViewById(R.id.button3)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button4)
        btn1.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
    }
}