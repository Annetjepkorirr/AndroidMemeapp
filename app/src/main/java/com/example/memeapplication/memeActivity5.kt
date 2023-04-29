package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memeActivity5 : AppCompatActivity() {
    lateinit var button6: Button
    lateinit var button5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        button6 = findViewById(R.id.button6)
        button5 =findViewById(R.id.button5)
        button6.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent =Intent(this,memefourActivity::class.java)
            startActivity(intent)
        }
    }
}