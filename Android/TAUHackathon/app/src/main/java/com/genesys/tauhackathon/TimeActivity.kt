package com.genesys.tauhackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
        findViewById<Button>(R.id.button5).setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }
    }
}