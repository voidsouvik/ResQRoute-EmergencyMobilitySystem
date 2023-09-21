package com.example.resqroute
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class PoliceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_police)

        // Receive driver's alert
        receiveDriverAlert()
    }

    private fun receiveDriverAlert() {
        // You can replace this with the logic that receives driver alerts
        // For example, if the driver sets their location in Firebase, you can set up a listener here
        // and display an alert when an alert is received.

        // For the purpose of this example, I'll use a simple dialog
        val alertDialog = AlertDialog.Builder(this)
            .setTitle("Driver Alert")
            .setMessage("Alert Received from Driver")
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .create()

        alertDialog.show()
        }
}