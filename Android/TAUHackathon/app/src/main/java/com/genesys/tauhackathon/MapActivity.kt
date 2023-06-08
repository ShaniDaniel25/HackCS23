package com.genesys.tauhackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map2)
        findViewById<Button>(R.id.button6).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}