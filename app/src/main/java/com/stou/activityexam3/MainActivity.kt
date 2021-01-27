package com.stou.activityexam3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exam1:Button = findViewById(R.id.button)
        val exam2:Button = findViewById(R.id.button2)
        val exam3:Button = findViewById(R.id.button3)
        val exam4:Button = findViewById(R.id.button4)
        val exam5:Button = findViewById(R.id.button9)
        val exam6:Button = findViewById(R.id.button10)
        val exam7:Button = findViewById(R.id.button15)
        exam1.setOnClickListener {

            val intent = Intent(this, Exam1::class.java)
            startActivity(intent)
        }
        exam2.setOnClickListener {
            val intent = Intent(this, Exam2::class.java)
            startActivity(intent)
        }
        exam3.setOnClickListener {
            val intent = Intent(this, Exam3::class.java)
            startActivity(intent)
        }
        exam4.setOnClickListener {
            val intent = Intent(this, Exam4::class.java)
            startActivity(intent)
        }
        exam5.setOnClickListener {
            val intent = Intent(this, Exam5::class.java)
            startActivity(intent)
        }
        exam6.setOnClickListener {
            val intent = Intent(this, Exam6::class.java)
            startActivity(intent)
        }
        exam7.setOnClickListener {
            val intent = Intent(this, Exam7::class.java)
            startActivity(intent)
        }
    }
}