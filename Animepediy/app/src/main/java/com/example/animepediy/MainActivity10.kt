package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
        var btn: Button
        btn=findViewById(R.id.button10)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
    }
}