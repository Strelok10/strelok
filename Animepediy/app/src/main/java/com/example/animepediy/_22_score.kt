package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class _22_score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_22_score)
        var btn: Button
        btn=findViewById(R.id.button50)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity18::class.java)
            startActivity(intent)
        }
    }
}