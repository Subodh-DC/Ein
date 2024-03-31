package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button=findViewById<Button>(R.id.himageButton)
        val button1=findViewById<Button>(R.id.himageButton1)
        val button2=findViewById<Button>(R.id.himageButton2)
        val button3=findViewById<Button>(R.id.himageButton3)
        val imageView=findViewById<ImageView>(R.id.himage)
        val quotes=findViewById<TextView>(R.id.quotes)


        button.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("homepagedata","Paragraphs")
            startActivity(intent)
        }

        button1.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("homepagedata","Oneline")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("homepagedata","Quiz")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("homepagedata","Trick")
            startActivity(intent)
        }

        val imageDetailsList = listOf(
            Model_for_image(R.drawable.lalkila, "Description 1","\"Make each day your masterpiece\""),
            Model_for_image(R.drawable.indiagate, "Description 2","\"test2\""),
            Model_for_image(R.drawable.tajmahel, "Description 3", "\"test3\"")

        )

        val randomImageDetails = imageDetailsList.random()
        val image=randomImageDetails.image
        imageView.setImageResource(image)
        quotes.text=randomImageDetails.quotes
        val detailsTextView = randomImageDetails.description

        imageView.setOnClickListener{
            val intent=Intent(this,showhomepageimage::class.java)
            intent.putExtra("text",detailsTextView)
            intent.putExtra("image",image)
            startActivity(intent)
        }



    }
}