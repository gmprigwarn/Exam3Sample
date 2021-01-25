package com.stou.activityexam3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Exam2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam_2)
        val linear_btn:Button = findViewById(R.id.button5)
        val relative_btn:Button = findViewById(R.id.button6)
        val constrain_btn:Button = findViewById(R.id.button7)
        linear_btn.setOnClickListener {

            val intent = Intent(this, Exam2_LinearLayout::class.java)
            startActivity(intent)
        }
        relative_btn.setOnClickListener {

            val intent = Intent(this, Exam2_RelativeLayout::class.java)
            startActivity(intent)
        }
        constrain_btn.setOnClickListener {

            val intent = Intent(this, Exam2_ConstrainLayout::class.java)
            startActivity(intent)
        }
    }
}