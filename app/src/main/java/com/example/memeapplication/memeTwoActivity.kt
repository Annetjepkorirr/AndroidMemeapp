package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memeTwoActivity : AppCompatActivity() {
    lateinit var tilbutton2: Button
    lateinit var tilbutton3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_two)
        tilbutton2 = findViewById(R.id.tilbutton2)
        tilbutton3 =findViewById(R.id.tilbutton3)
        tilbutton2.setOnClickListener {
            val intent = Intent(this, memethreeActivity::class.java)
            startActivity(intent)

        }
        tilbutton3.setOnClickListener {
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}