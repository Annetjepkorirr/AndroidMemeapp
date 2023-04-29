package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memethreeActivity : AppCompatActivity() {
    lateinit var button4: Button
    lateinit var button3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memethree)
        button4 = findViewById(R.id.button4)
        button3 = findViewById(R.id.button3)
        button4.setOnClickListener {
            val intent = Intent(this, memefourActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent =Intent(this,memeTwoActivity::class.java)
            startActivity(intent)
        }
    }
}