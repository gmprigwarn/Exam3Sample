package com.stou.activityexam3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Exam6_PutExtra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam6__put_extra)
        val textView:TextView = findViewById(R.id.textView9)
        val text = intent.extras!!.getString("putExtra")
        textView.text = text
    }
}