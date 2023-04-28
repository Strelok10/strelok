package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout._5_score)
        var btn: Button
        btn=findViewById(R.id.button24)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button26)
        btn1.setOnClickListener {
            val intent = Intent(this, _55_score::class.java)
            startActivity(intent)
        }
    }
}