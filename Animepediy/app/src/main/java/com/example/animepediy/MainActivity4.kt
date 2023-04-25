package com.example.animepediy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var btn: Button
        btn=findViewById(R.id.button11)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        var btn1: Button
        btn1=findViewById(R.id.button9)
        btn1.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        var btn2: Button
        btn2=findViewById(R.id.button5)
        btn2.setOnClickListener{
            val intent = Intent(this, MainActivity17::class.java)
            startActivity(intent)
        }
        var btn3: Button
        btn3=findViewById(R.id.button10)
        btn3.setOnClickListener{
            val intent = Intent(this, MainActivity18::class.java)
            startActivity(intent)
        }
        var btn4: Button
        btn4=findViewById(R.id.button6)
        btn4.setOnClickListener{
            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)
        }
        var btn5: Button
        btn5=findViewById(R.id.button7)
        btn5.setOnClickListener{
            val intent = Intent(this, MainActivity20::class.java)
            startActivity(intent)
        }
        var btn6: Button
        btn6=findViewById(R.id.button8)
        btn6.setOnClickListener{
            val intent = Intent(this, MainActivity21::class.java)
            startActivity(intent)
        }
    }
}