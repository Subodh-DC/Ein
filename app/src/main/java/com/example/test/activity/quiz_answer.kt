package com.example.test.activity

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test.R

class quiz_answer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_answer)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val quiz_question=findViewById<TextView>(R.id.quiz_question)
        val submit=findViewById<Button>(R.id.quiz_submit)
        val rd1=findViewById<RadioButton>(R.id.radioButtonOption1)
        val rd2=findViewById<RadioButton>(R.id.radioButtonOption2)
        val rd3=findViewById<RadioButton>(R.id.radioButtonOption3)
        val rd4=findViewById<RadioButton>(R.id.radioButtonOption4)


        val data=intent.getStringExtra("question")

        //Quiz category
        //these all question of Quiz indian History
        if (data=="Q1. Quiz indian History"){
            quiz_question.text="$data"
            submit.setOnClickListener {
                if (rd1.isChecked){

                }

                if (rd2.isChecked){

                }
                if (rd3.isChecked){

                }
                if (rd4.isChecked){

                }
            }
        }

        //these all question of Quiz world History
        if (data=="Q1. Quiz world History"){
            quiz_question.text="$data"
            submit.setOnClickListener {
                if (rd1.isChecked){

                }

                if (rd2.isChecked){

                }
                if (rd3.isChecked){

                }
                if (rd4.isChecked){

                }
            }
        }

        //these all question of Quiz indian Geography
        if (data=="Q1. Quiz indian Geography"){
            quiz_question.text="$data"
            submit.setOnClickListener {
                if (rd1.isChecked){

                }

                if (rd2.isChecked){

                }
                if (rd3.isChecked){

                }
                if (rd4.isChecked){

                }
            }
        }

        //these all question of Quiz world Geography
        if (data=="Q1. Quiz world Geography"){
            quiz_question.text="$data"
            submit.setOnClickListener {
                if (rd1.isChecked){

                }

                if (rd2.isChecked){

                }
                if (rd3.isChecked){

                }
                if (rd4.isChecked){

                }
            }
        }

        //these all question of Quiz micro Economics
        if (data=="Q1. Quiz micro Economics"){
            quiz_question.text="$data"
            submit.setOnClickListener {
                if (rd1.isChecked){

                }

                if (rd2.isChecked){

                }
                if (rd3.isChecked){

                }
                if (rd4.isChecked){

                }
            }
        }

        //these all question of Quiz macro Economics
        if (data=="Q1. Quiz macro Economics"){
            quiz_question.text="$data"
            submit.setOnClickListener {
                if (rd1.isChecked){

                }

                if (rd2.isChecked){

                }
                if (rd3.isChecked){

                }
                if (rd4.isChecked){

                }
            }
        }

        //these all question of Quiz Reasoning
        if (data=="Q1. Quiz Reasoning"){
            quiz_question.text="$data"
            submit.setOnClickListener {
                if (rd1.isChecked){

                }

                if (rd2.isChecked){

                }
                if (rd3.isChecked){

                }
                if (rd4.isChecked){

                }
            }
        }
    }
}