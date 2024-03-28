package com.example.test


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)


        val Recyclerview=findViewById<RecyclerView>(R.id.Recycler_question)


        val arrayList= arrayListOf<Modelclass_for_Qustion>()


        val adapterclass_for_Question=adapterclass_for_Question(this,arrayList)

        Recyclerview.adapter=adapterclass_for_Question
        Recyclerview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        //get data from miniadapter
        val minidata=intent.getStringExtra("minidata")

        //these all data get from miniadapter and show question according to Paragraphs category
        if (minidata=="Paragraphs indian History"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs indian History1","Q1. Paragraphs indian History"))
            arrayList.add(Modelclass_for_Qustion("Paragraphs indian History2","Q2. Paragraphs indian History"))
            arrayList.add(Modelclass_for_Qustion("Paragraphs indian History3","Q3. Paragraphs indian History"))
        }
        else if (minidata=="Paragraphs world History"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs world History1","Q1. Paragraphs world History"))
        }
        else if (minidata=="Paragraphs indian Geography"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs indian Geography1","Q1. Paragraphs indian Geography"))
        }
        else if (minidata=="Paragraphs world Geography"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs world Geography1","Q1. Paragraphs world Geography"))
        }
        else if (minidata=="Paragraphs micro Economics"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs micro Economics1","Q1. Paragraphs micro Economics"))
        }
        else if (minidata=="Paragraphs macro Economics"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs macro Economics1","Q1. Paragraphs macro Economics"))
        }


        //these all data get from miniadapter and show question according to Oneline category
        if (minidata=="Oneline indian History"){
            arrayList.add(Modelclass_for_Qustion("Oneline indian History1","Q1. Oneline indian History"))
        }
        else if (minidata=="Oneline world History"){
            arrayList.add(Modelclass_for_Qustion("Oneline world History1","Q1. Oneline world History"))
        }
        else if (minidata=="Oneline indian Geography"){
            arrayList.add(Modelclass_for_Qustion("Oneline indian Geography1","Q1. Oneline indian Geography"))
        }
        else if (minidata=="Oneline world Geography"){
            arrayList.add(Modelclass_for_Qustion("Oneline world Geography1","Q1. Oneline world Geography"))
        }
        else if (minidata=="Oneline micro Economics"){
            arrayList.add(Modelclass_for_Qustion("Oneline micro Economics1","Q1. Oneline micro Economics"))
        }
        else if (minidata=="Oneline macro Economics"){
            arrayList.add(Modelclass_for_Qustion("Oneline macro Economics1","Q1. Oneline macro Economics"))
        }


        //these all data get from miniadapter and show question according to Quiz category
        if (minidata=="Quiz indian History"){
            arrayList.add(Modelclass_for_Qustion("Quiz indian History1","Q1. Quiz indian History"))
        }
        else if (minidata=="Quiz world History"){
            arrayList.add(Modelclass_for_Qustion("Quiz world History1","Q1. Quiz world History"))
        }
        else if (minidata=="Quiz indian Geography"){
            arrayList.add(Modelclass_for_Qustion("Quiz indian Geography1","Q1. Quiz indian Geography"))
        }
        else if (minidata=="Quiz world Geography"){
            arrayList.add(Modelclass_for_Qustion("Quiz world Geography1","Q1. Quiz world Geography"))
        }
        else if (minidata=="Quiz micro Economics"){
            arrayList.add(Modelclass_for_Qustion("Quiz micro Economics1","Q1. Quiz micro Economics"))
        }
        else if (minidata=="Quiz macro Economics"){
            arrayList.add(Modelclass_for_Qustion("Quiz macro Economics1","Q1. Quiz macro Economics"))
        }


        //these all data get from miniadapter and show question according to Trick category
        if (minidata=="Trick indian History"){
            arrayList.add(Modelclass_for_Qustion("Trick indian History1","Q1. Trick indian History"))
        }
        else if (minidata=="Trick world History"){
            arrayList.add(Modelclass_for_Qustion("Trick world History1","Q1. Trick world History"))
        }
        else if (minidata=="Trick indian Geography"){
            arrayList.add(Modelclass_for_Qustion("Trick indian Geography1","Q1. Trick indian Geography"))
        }
        else if (minidata=="Trick world Geography"){
            arrayList.add(Modelclass_for_Qustion("Trick world Geography1","Q1. Trick world Geography"))
        }
        else if (minidata=="Trick micro Economics"){
            arrayList.add(Modelclass_for_Qustion("Trick micro Economics1","Q1. Trick micro Economics"))
        }
        else if (minidata=="Trick macro Economics"){
            arrayList.add(Modelclass_for_Qustion("Trick macro Economics1","Q1. Trick macro Economics"))
        }




    }
}