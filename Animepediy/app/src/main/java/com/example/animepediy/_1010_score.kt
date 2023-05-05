package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class _1010_score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1010_score)
        var btn: Button
        btn=findViewById(R.id.button58)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity26::class.java)
            startActivity(intent)
        }
    }
}