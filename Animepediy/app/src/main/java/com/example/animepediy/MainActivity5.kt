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
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button12)
        btn1.setOnClickListener{
            val intent = Intent(this, MainActivity22::class.java)
            startActivity(intent)
        }
        var btn2: Button
        btn2=findViewById(R.id.button14)
        btn2.setOnClickListener{
            val intent = Intent(this, MainActivity23::class.java)
            startActivity(intent)
        }
        var btn3: Button
        btn3=findViewById(R.id.button13)
        btn3.setOnClickListener{
            val intent = Intent(this, MainActivity24::class.java)
            startActivity(intent)
        }
        var btn4: Button
        btn4=findViewById(R.id.button15)
        btn4.setOnClickListener {
            val intent = Intent(this, MainActivity25::class.java)
            startActivity(intent)
        }
        var btn5: Button
        btn5=findViewById(R.id.button16)
        btn5.setOnClickListener{
            val intent = Intent(this, MainActivity26::class.java)
            startActivity(intent)
        }
    }
}