import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.viajapp.R // Asegúrate de usar el R correcto

class CreateTripActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_trip)

        val addPhotosButton: Button = findViewById(R.id.add_photos_button)
        val saveTripButton: Button = findViewById(R.id.save_trip_button)

        addPhotosButton.setOnClickListener {
            // Lógica para seleccionar fotos (puedes implementar un Intent para abrir la galería)
        }

        saveTripButton.setOnClickListener {
            // Lógica para guardar el viaje
            startActivity(Intent(this@CreateTripActivity, HomeActivity::class.java))
        }
    }
}

