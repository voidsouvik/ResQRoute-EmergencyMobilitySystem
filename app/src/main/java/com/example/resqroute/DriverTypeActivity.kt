package com.example.resqroute

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class DriverTypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_type)
    }

    fun onTowardPatientClick(view: View) {
        val intent = Intent(this, JourneyMapActivity::class.java)
        intent.putExtra("journeyType", "patient")
        startActivity(intent)
    }

    fun onTowardHospitalClick(view: View) {
        val intent = Intent(this, JourneyMapActivity::class.java)
        intent.putExtra("journeyType", "hospital")
        startActivity(intent)
        }
}