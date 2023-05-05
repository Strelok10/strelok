package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity19 : AppCompatActivity() {
    lateinit var text1: TextView
    lateinit var text2: TextView
    lateinit var text3: TextView
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout._3_score)
        var btn: Button
        btn = findViewById(R.id.button21)
        text1 = findViewById(R.id.textView13)
        text2 = findViewById(R.id.textView14)
        text3 = findViewById(R.id.textView15)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1 = findViewById(R.id.button22)
        btn1.setOnClickListener {
            val intent = Intent(this, _33_score::class.java)
            startActivity(intent)
        }
        var btn2: Button
        btn2 = findViewById(R.id.button39)
        btn2.setOnClickListener {
            if (count == 0) {
                text1.isVisible = false
                text2.isVisible = false
                text3.isVisible = false
                count = 1
            } else {
                text1.isVisible = true
                text2.isVisible = true
                text3.isVisible = true
                count = 0
            }
        }
    }
}