package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class _55_score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_55_score)
        var btn: Button
        btn=findViewById(R.id.button53)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity21::class.java)
            startActivity(intent)
        }
    }
}