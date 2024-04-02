package com.example.test.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test.modelclass.Modelclass_for_answer
import com.example.test.R

class answer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_answer)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val image=findViewById<ImageView>(R.id.aa)
        val question=findViewById<TextView>(R.id.aa1)
        val answer=findViewById<TextView>(R.id.aa2)

        val array= arrayListOf<Modelclass_for_answer>()

        val data=intent.getStringExtra("question")

        //these all for get data from adapterclass_for_Question

        //Paragraphs category
        //these all question of Paragraphs indian History
        if (data=="Q1. Paragraphs indian History"){
            image.setImageResource(R.drawable.amir)
            question.text="$data"
            answer.text="Ans1. Paragraphs indian History"
        }
        else if (data=="Q2. Paragraphs indian History"){
            image.setImageResource(R.drawable.rajpal)
            question.text="$data"
            answer.text="Ans2. Paragraphs indian History"
        }
        else if (data=="Q3. Paragraphs indian History"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans3. Oneline indian History"
        }

        //these all question of Paragraphs world History
        if (data=="Q1. Paragraphs world History"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Paragraphs world History"
        }

        //these all question of Paragraphs indian Geography
        if (data=="Q1. Paragraphs indian Geography"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Paragraphs indian Geography"
        }

        //these all question of Paragraphs world Geography
        if (data=="Q1. Paragraphs world Geography"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Paragraphs world Geography"
        }

        //these all question of Paragraphs micro Economics
        if (data=="Q1. Paragraphs micro Economics"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Paragraphs micro Economics"
        }

        //these all question of Paragraphs macro Economics
        if (data=="Q1. Paragraphs macro Economics"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Paragraphs macro Economics"
        }


        /*//Oneline category
        //these all question of Oneline indian History
        if (data=="Q1. Oneline indian History"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Oneline indian History"
        }

        //these all question of Oneline world History
        if (data=="Q1. Oneline world History"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Oneline world History"
        }

        //these all question of Oneline indian Geography
        if (data=="Q1. Oneline indian Geography"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Oneline indian Geography"
        }

        //these all question of Oneline world Geographyy
        if (data=="Q1. Oneline world Geography"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Oneline world Geography"
        }

        //these all question of Oneline micro Economics
        if (data=="Q1. Oneline micro Economics"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Oneline micro Economics"
        }

        //these all question of Oneline macro Economics
        if (data=="Q1. Oneline macro Economics"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Oneline macro Economics"
        }*/


        //Quiz category
        //these all question of Quiz indian History
        if (data=="Q1. Quiz indian History"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Quiz indian History"
        }

        //these all question of Quiz world History
        if (data=="Q1. Quiz world History"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Quiz world History"
        }

        //these all question of Quiz indian Geography
        if (data=="Q1. Quiz indian Geography"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Quiz indian Geography"
        }

        //these all question of Quiz world Geography
        if (data=="Q1. Quiz world Geography"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Quiz world Geography"
        }

        //these all question of Quiz micro Economics
        if (data=="Q1. Quiz micro Economics"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Quiz micro Economics"
        }

        //these all question of Quiz macro Economics
        if (data=="Q1. Quiz macro Economics"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Quiz macro Economics"
        }

        //Trick category
        //these all question of Trick indian History
        if (data=="Q1. Trick indian History"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Trick indian History"
        }

        //these all question of Trick world History
        if (data=="Q1. Trick world History"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Trick world History"
        }

        //these all question of Trick indian Geography
        if (data=="Q1. Trick indian Geography"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Trick indian Geography"
        }

        //these all question of Trick world Geography
        if (data=="Q1. Trick world Geography"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Trick world Geography"
        }

        //these all question of Trick micro Economics
        if (data=="Q1. Trick micro Economics"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Trick micro Economics"
        }

        //these all question of Trick macro Economics
        if (data=="Q1. Trick macro Economics"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="Ans. Trick macro Economics"
        }


    }
}