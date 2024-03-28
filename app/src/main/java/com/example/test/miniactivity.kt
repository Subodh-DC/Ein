package com.example.test

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class miniactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miniactivity)

        val array= arrayListOf<Model_for_minicat>()


        val adapterForMiniadapter=adapter_for_miniadapter(this,array)

        val recyclerView=findViewById<RecyclerView>(R.id.Recycler_mini)
        recyclerView.adapter=adapterForMiniadapter
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        //get data from recyclerview of adapterclass
        val data=intent.getStringExtra("data")


       /* val Paragraphs="Paragraphs"
        val Oneline="Oneline"
        val Quiz="Quiz"
        val Trick="Trick"*/

        //these all data for get key from adapter class and Paragraphs
        if (data=="Paragraphs History"){
            array.add(Model_for_minicat("Paragraphs History","Indian History",R.drawable.india_history))
            array.add(Model_for_minicat("Paragraphs History","World History",R.drawable.worldhistory))
        }
        else if (data=="Paragraphs Geography"){
            array.add(Model_for_minicat("Paragraphs Geography","Indian Geography",R.drawable.india_geo))
            array.add(Model_for_minicat("Paragraphs Geography","World Geography",R.drawable.world_geo))
        }
        else if (data=="Paragraphs Economics"){
            array.add(Model_for_minicat("Paragraphs Economics","Micro Economics",R.drawable.micro_eco))
            array.add(Model_for_minicat("Paragraphs Economics","Macro Economics",R.drawable.macro_eco))
        }


        //these all data for get key from adapter class and Oneline
        if (data=="Oneline History"){
            array.add(Model_for_minicat("Oneline History","Indian History",R.drawable.india_history))
            array.add(Model_for_minicat("Oneline History","World History",R.drawable.worldhistory))
        }
        else if (data=="Oneline Geography"){
            array.add(Model_for_minicat("Oneline Geography","Indian Geography",R.drawable.india_geo))
            array.add(Model_for_minicat("Oneline Geography","World Geography",R.drawable.world_geo))
        }
        else if (data=="Oneline Economics"){
            array.add(Model_for_minicat("Oneline Economics","Micro Economics",R.drawable.micro_eco))
            array.add(Model_for_minicat("Oneline Economics","Macro Economics",R.drawable.macro_eco))
        }

        //these all data for get key from adapter class and Quiz
        if (data=="Quiz History"){
            array.add(Model_for_minicat("Quiz History","Indian History",R.drawable.india_history))
            array.add(Model_for_minicat("Quiz History","World History",R.drawable.worldhistory))
        }
        else if (data=="Quiz Geography"){
            array.add(Model_for_minicat("Quiz Geography","Indian Geography",R.drawable.india_geo))
            array.add(Model_for_minicat("Quiz Geography","World Geography",R.drawable.world_geo))
        }
        else if (data=="Quiz Economics"){
            array.add(Model_for_minicat("Quiz Economics","Micro Economics",R.drawable.micro_eco))
            array.add(Model_for_minicat("Quiz Economics","Macro Economics",R.drawable.macro_eco))
        }

        //these all data for get key from adapter class and Trick
        if (data=="Trick History"){
            array.add(Model_for_minicat("Trick History","Indian History",R.drawable.india_history))
            array.add(Model_for_minicat("Trick History","World History",R.drawable.worldhistory))
        }
        else if (data=="Trick Geography"){
            array.add(Model_for_minicat("Trick Geography","Indian Geography",R.drawable.india_geo))
            array.add(Model_for_minicat("Trick Geography","World Geography",R.drawable.world_geo))
        }
        else if (data=="Trick Economics"){
            array.add(Model_for_minicat("Trick Economics","Micro Economics",R.drawable.micro_eco))
            array.add(Model_for_minicat("Trick Economics","Macro Economics",R.drawable.macro_eco))
        }


    }
}