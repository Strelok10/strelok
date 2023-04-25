package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout._8_score)
        var btn: Button
        btn=findViewById(R.id.button32)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button33)
        btn1.setOnClickListener {
            val intent = Intent(this, _88_score::class.java)
            startActivity(intent)
        }
    }
}