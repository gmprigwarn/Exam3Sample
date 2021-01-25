package com.stou.activityexam3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Exam3 : AppCompatActivity() {
    @SuppressLint("ShowToast", "WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam3)
        val toastCenter : Button = findViewById(R.id.toast_center)
        val toastBottom: Button = findViewById(R.id.toast_bottom)
        toastBottom.setOnClickListener {
           Toast.makeText(this, "Toast Bottom", Toast.LENGTH_LONG).show()

        }
        toastCenter.setOnClickListener {
           val toast = Toast.makeText(this, "message", Toast.LENGTH_LONG)
           // val toast = Toast(this)

           //toast.duration = 3
//            toast.setText("new message")
            toast.setGravity(Gravity.CENTER, 0, 0)

            toast.show()
        }
    }
}