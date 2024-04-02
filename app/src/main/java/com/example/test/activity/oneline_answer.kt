package com.example.test.activity

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test.R

class oneline_answer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_oneline_answer)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val question1=findViewById<TextView>(R.id.oneline_ques)
        val answer1=findViewById<TextView>(R.id.oneline_ans)


        //get data from question adapter for oneline question
        val data =intent.extras?.getString("question")

        //Oneline category
        //these all question of Oneline indian History
        if (data=="Q1. Oneline indian History"){
            question1.text="$data"
            answer1.text="Ans. Oneline indian History"
        }

        //these all question of Oneline world History
        if (data=="Q1. Oneline world History"){
            question1.text="$data"
            answer1.text="Ans. Oneline world History"
        }

        //these all question of Oneline indian Geography
        if (data=="Q1. Oneline indian Geography"){
            question1.text="$data"
            answer1.text="Ans. Oneline indian Geography"
        }

        //these all question of Oneline world Geographyy
        if (data=="Q1. Oneline world Geography"){
            question1.text="$data"
            answer1.text="Ans. Oneline world Geography"
        }

        //these all question of Oneline micro Economics
        if (data=="Q1. Oneline micro Economics"){
            question1.text="$data"
            answer1.text="Ans. Oneline micro Economics"
        }

        //these all question of Oneline macro Economics
        if (data=="Q1. Oneline macro Economics"){
            question1.text="$data"
            answer1.text="Ans. Oneline macro Economics"
        }
    }
}