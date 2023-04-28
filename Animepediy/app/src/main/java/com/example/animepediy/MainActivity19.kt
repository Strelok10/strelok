package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout._3_score)
        var btn: Button
        btn=findViewById(R.id.button21)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button22)
        btn1.setOnClickListener {
            val intent = Intent(this, _33_score::class.java)
            startActivity(intent)
        }
    }
}