package com.ritik.birthdaywishingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        val txt3 = findViewById<TextView>(R.id.textt3)

        val birthday = intent.getStringExtra("nametxt")

        txt3.text = "HAPPY BIRTHDAY $birthday"
    }
}