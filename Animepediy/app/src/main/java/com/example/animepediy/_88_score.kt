package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class _88_score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_88_score)
        var btn: Button
        btn=findViewById(R.id.button56)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity24::class.java)
            startActivity(intent)
        }
    }
}