package com.example.test

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class showhomepageimage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_showhomepageimage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val image=findViewById<ImageView>(R.id.getimage)
        val text=findViewById<TextView>(R.id.gettext)

        //get data from home page
        val imagedata=intent.extras?.getInt("image")
        val textdata=intent.extras?.getString("text")

        text.text=textdata

        if (imagedata != null) {
            image.setImageResource(imagedata)
        }
    }
}