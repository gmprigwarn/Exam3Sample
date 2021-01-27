package com.stou.activityexam3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class Exam7 : AppCompatActivity() {
    var radioGroup:RadioGroup? = null
    var button:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam7)
        radioGroup = findViewById(R.id.radioGroup)
        button = findViewById(R.id.button14)
        button!!.setOnClickListener {
            checkSelection()
        }
    }
    private fun checkSelection() {
        val selectedID: Int = radioGroup!!.checkedRadioButtonId
        var message = ""
        if(selectedID == -1){
            message = "You haven't selected any choice."
        }else{
            message = "You selected " + findViewById<RadioButton>(selectedID).text.toString()
        }
        Toast.makeText(this, "$message", Toast.LENGTH_SHORT).show()
    }
}
