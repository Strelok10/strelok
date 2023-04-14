package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var btn: Button
        btn=findViewById(R.id.button11)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button9)
        btn1.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}