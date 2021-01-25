package com.stou.activityexam3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Exam6_Serializable : AppCompatActivity() {
    var person: Person? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam6__serializable)

        val extras = intent.extras
        if (extras != null) {
            person= intent.getSerializableExtra("Serializable") as Person? //Obtaining data
        }
        val textName:TextView = findViewById(R.id.textView10)
        val textAge:TextView = findViewById(R.id.textView11)
        textName.text = person!!.name
        textAge.text = person!!.age.toString()

    }
}