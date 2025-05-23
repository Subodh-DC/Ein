package com.example.test.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test.R

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splashscreen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

     /*   Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },3000)
*/

        val videoView = findViewById<VideoView>(R.id.videoView)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.splash_s
        val videoUri = Uri.parse(videoPath)
        videoView.setVideoURI(videoUri)

        videoView.setOnCompletionListener {
            // Navigate to the next activity when the video finishes
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        videoView.start()
    }
}