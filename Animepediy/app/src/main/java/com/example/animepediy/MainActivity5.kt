package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var btn: Button
        btn=findViewById(R.id.button10)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}