package com.ritik.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<TextView>(R.id.textt1)

        val submit = findViewById<Button>(R.id.btnn1)


        submit.setOnClickListener{
            val intent = Intent(this,BirthdayActivity::class.java)

            var nametxt = input.text.toString()

            intent.putExtra("nametxt", nametxt)
            startActivity(intent)
        }
    }
}