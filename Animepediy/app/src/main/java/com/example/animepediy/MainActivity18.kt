package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout._2_score)
        var btn: Button
        btn=findViewById(R.id.button43)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button44)
        btn1.setOnClickListener {
            val intent = Intent(this, _22_score::class.java)
            startActivity(intent)
        }
    }
}