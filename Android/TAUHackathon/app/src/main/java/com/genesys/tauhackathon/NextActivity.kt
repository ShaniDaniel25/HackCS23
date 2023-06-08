package com.genesys.tauhackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        findViewById<Button>(R.id.button8).setOnClickListener {
            startActivity(Intent(this, WIP::class.java))
        }
    }
}