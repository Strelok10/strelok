package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout._7_score)
        var btn: Button
        btn=findViewById(R.id.button29)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button30)
        btn1.setOnClickListener {
            val intent = Intent(this, _77_score::class.java)
            startActivity(intent)
        }
    }
}