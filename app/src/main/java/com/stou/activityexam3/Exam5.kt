package com.stou.activityexam3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Exam5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam5)
        val nextAct:Button = findViewById(R.id.button10)
        nextAct.setOnClickListener {
            val intent = Intent(this, Exam5_New::class.java)
            startActivity(intent)
        }
    }
}