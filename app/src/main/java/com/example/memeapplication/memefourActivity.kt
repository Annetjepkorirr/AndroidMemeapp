package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memefourActivity : AppCompatActivity() {
    lateinit var button10: Button
    lateinit var button9: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memefour)
        button10 = findViewById(R.id.button10)
        button9 = findViewById(R.id.button9)
        button10.setOnClickListener {
            val intent = Intent(this, memeActivity5::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent =Intent(this,memethreeActivity::class.java)
            startActivity(intent)
        }
    }
}