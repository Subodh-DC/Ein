package com.example.test.activity

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.test.modelclass.Model_for_image
import com.example.test.R

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
        val hamburger=findViewById<ImageView>(R.id.hamburger_icon)
        val notification=findViewById<ImageView>(R.id.notification_bell)
        val drawerlayout=findViewById<DrawerLayout>(R.id.drawer)

        hamburger?.setOnClickListener {
            drawerlayout?.openDrawer(GravityCompat.START)
        }

        notification.setOnClickListener {
            Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show()
        }

        button.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
            intent.putExtra("homepagedata","Paragraphs")
            startActivity(intent)
        }

        button1.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
            intent.putExtra("homepagedata","Oneline")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
            intent.putExtra("homepagedata","Quiz")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
            intent.putExtra("homepagedata","Trick")
            startActivity(intent)
        }

        val imageDetailsList = listOf(
            Model_for_image(R.drawable.lalkila, "Description 1","\"Make each day your masterpiece\""),
            Model_for_image(R.drawable.indiagate, "Description 2","\"Nothing is impossible. The word itself says 'I'm possible!\""),
            Model_for_image(R.drawable.tajmahel, "Description 3", "\"The bad news is time flies. The good news is you're the pilot.\""),
            Model_for_image(R.drawable.earth_removebg, "Description 3", "\"Spread love everywhere you go.\""),
            Model_for_image(R.drawable.indiaflag_removebg, "Description 3", "\"Some people look for a beautiful place. Others make a place beautiful.\""),
            Model_for_image(R.drawable.map_removebg, "Description 3", "\"Happiness is not by chance, but by choice.\""),
            Model_for_image(R.drawable.math_removebg, "Description 3", "\"You cannot change what you are, only what you do.\""),
            Model_for_image(R.drawable.moutain_removebg, "Description 3", "\"I have not failed. I've just found 10,000 ways that won't work.\""),
            Model_for_image(R.drawable.robot_removebg, "Description 3", "\"I've got nothing to do today but smile.\""),
            Model_for_image(R.drawable.seterlight_removebg, "Description 3", "\"\""),
            Model_for_image(R.drawable.tree_removebg, "Description 3", "\"\""),
            Model_for_image(R.drawable.chemistry_removebg, "Description 3", "\"\""),
            Model_for_image(R.drawable.dna_removebg, "Description 3", "\"\""),
            Model_for_image(R.drawable.download18569, "Description 3", "\"\"")

        )

        val randomImageDetails = imageDetailsList.random()
        val image=randomImageDetails.image
        imageView.setImageResource(image)
        quotes.text=randomImageDetails.quotes
        val detailsTextView = randomImageDetails.description

        imageView.setOnClickListener{
            val intent=Intent(this, showhomepageimage::class.java)
            intent.putExtra("text",detailsTextView)
            intent.putExtra("image",image)
            startActivity(intent)
        }



    }
}