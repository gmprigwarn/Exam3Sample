package com.stou.activityexam3

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Exam6_Parcelable : AppCompatActivity() {
    var person: Person1? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam6__parcelable)
      /*  val extras = intent.extras
        if (extras != null) {
            person = extras.getParcelable("Parcelable") //Obtaining data
        }*/
        person = intent.extras!!.getParcelable("Parcelable")!!
        val textName: TextView = findViewById(R.id.textView17)
        val textAge: TextView = findViewById(R.id.textView18)
        Log.e("data", person!!.name)
        textName.text = person!!.name
        textAge.text = person!!.age.toString()

    }
}