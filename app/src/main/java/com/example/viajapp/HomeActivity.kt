package com.example.viajapp

import CreateTripActivity
import android.annotation.SuppressLint
import android.content.Intent // Asegúrate de importar Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val createTripButton: Button = findViewById(R.id.create_trip_button)
        val viewMapButton: Button = findViewById(R.id.view_map_button)

        createTripButton.setOnClickListener {
            startActivity(Intent(this@HomeActivity, CreateTripActivity::class.java))
        }

        viewMapButton.setOnClickListener {
            startActivity(Intent(this@HomeActivity, MapActivity::class.java))
        }
    }
}
