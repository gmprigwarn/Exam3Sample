package com.stou.activityexam3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class Exam4 : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam4)
        val textView:TextView = findViewById(R.id.textView6)
        val button:Button = findViewById(R.id.button8)
        val switch:Switch = findViewById(R.id.switch1)
        textView.setOnClickListener {
            Toast.makeText(this, "Click Me TextView", Toast.LENGTH_LONG).show()
        }
        button.setOnClickListener {
            Toast.makeText(this, "Click Me Button", Toast.LENGTH_LONG).show()
        }
        switch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                Toast.makeText(this, "Click Me Switch ON", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Click Me Switch OFF", Toast.LENGTH_LONG).show()

            }
        }
    }
}