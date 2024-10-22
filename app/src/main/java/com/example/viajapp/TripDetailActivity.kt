package com.example.viajapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TripDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip_detail)

        val editTripButton: Button = findViewById(R.id.edit_trip_button)
        val shareItineraryButton: Button = findViewById(R.id.share_itinerary_button)

        editTripButton.setOnClickListener {
            // Lógica para editar el viaje
        }

        shareItineraryButton.setOnClickListener {
            // Lógica para compartir el itinerario
        }
    }
}
