package com.example.resqroute
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.model.LatLng

class JourneyMapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_journey_map)

        val journeyType = intent.getStringExtra("journeyType")

        if (journeyType == "patient") {
            openGoogleMaps(LatLng(12.9655, 77.6107)) // Patient's location
        } else if (journeyType == "hospital") {
            openGoogleMaps(LatLng(12.9755, 77.6257)) // Hospital's location
        }
    }

    private fun openGoogleMaps(destination: LatLng) {
        val intentUri = Uri.parse("google.navigation:q=${destination.latitude},${destination.longitude}")
        val mapIntent = Intent(Intent.ACTION_VIEW, intentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
        finish()
        }
}