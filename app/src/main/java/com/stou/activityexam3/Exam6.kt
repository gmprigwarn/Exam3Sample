package com.stou.activityexam3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Exam6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam6)
        val putExtra:Button = findViewById(R.id.button11)
        val serializable:Button = findViewById(R.id.button12)
        val parcelable:Button = findViewById(R.id.button13)
        putExtra.setOnClickListener {
            val intent = Intent(this, Exam6_PutExtra::class.java)
            intent.putExtra("putExtra", "Tawatchai Samakdee 6096007544")
            startActivity(intent)
        }
        serializable.setOnClickListener {
            val person = Person("ธวัชชัย สมัครดี",37)
            val intent = Intent(this, Exam6_Serializable::class.java)
            intent.putExtra("Serializable", person) //second param is Serializable
            startActivity(intent)
        }
        parcelable.setOnClickListener {
            val person = Person1("Tawatchai Samakdee",37)
            val intent = Intent(this, Exam6_Parcelable::class.java)
            intent.putExtra("Parcelable", person) //second param is Serializable
            startActivity(intent)
        }
    }
}