package com.example.resqroute

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val driverButton = findViewById<Button>(R.id.driverButton)
        driverButton.setOnClickListener {
            val intent = Intent(this, DriverTypeActivity::class.java)
            startActivity(intent)
        }

        val policeButton = findViewById<Button>(R.id.policeButton)

        policeButton.setOnClickListener {
            val intent = Intent(this, PoliceActivity::class.java)
            startActivity(intent)
            }
        }
}
