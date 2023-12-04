package com.example.resep_menu23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Tampilkan informasi diri
        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val emailTextView: TextView = findViewById(R.id.emailTextView)
        val photoImageView: CircleImageView = findViewById(R.id.photoImageView)

        nameTextView.text = "Adi Rifta Dwi Kurniawan"
        emailTextView.text = "adiriftadk@gmail.com"
        // Set the actual image resource or use other methods to load your image
        photoImageView.setImageResource(R.drawable.foto)
        supportActionBar?.hide()    }

}