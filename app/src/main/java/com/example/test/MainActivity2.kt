package com.example.test

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val arrayList= arrayListOf<ModelClass>()
        /*arrayList.add(ModelClass("Paragraphs",R.drawable.rajpal,"History"))
        arrayList.add(ModelClass("Paragraphs",R.drawable.lalkila,"Geography"))
        arrayList.add(ModelClass("Paragraphs",R.drawable.lalkila,"Constitution"))
        arrayList.add(ModelClass("Paragraphs",R.drawable.indiagate,"Science"))
        arrayList.add(ModelClass("Paragraphs",R.drawable.indiagate,"Economic"))
        arrayList.add(ModelClass("Paragraphs",R.drawable.tajmahle,"Computer"))
        arrayList.add(ModelClass("Paragraphs",R.drawable.tajmahle,"Reasoning"))*/

        val adapterclass=adapterclass(this,arrayList)

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.adapter=adapterclass
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        //get data from home page
        val data = intent.extras?.getString("homepagedata")

        if (data == "Paragraphs") {
            arrayList.add(ModelClass("Paragraphs", R.drawable.history, "History"))
            arrayList.add(ModelClass("Paragraphs", R.drawable.geography, "Geography"))
            arrayList.add(ModelClass("Paragraphs", R.drawable.constitution, "Constitution"))
            arrayList.add(ModelClass("Paragraphs", R.drawable.science, "Science"))
            arrayList.add(ModelClass("Paragraphs", R.drawable.economy, "Economic"))
            arrayList.add(ModelClass("Paragraphs", R.drawable.computer, "Computer"))
            arrayList.add(ModelClass("Paragraphs", R.drawable.reasoning, "Reasoning"))
        }
        else if (data=="Oneline"){
            arrayList.add(ModelClass("Oneline",R.drawable.history,"History"))
            arrayList.add(ModelClass("Oneline",R.drawable.geography,"Geography"))
            arrayList.add(ModelClass("Oneline",R.drawable.constitution,"Constitution"))
            arrayList.add(ModelClass("Oneline",R.drawable.science,"Science"))
            arrayList.add(ModelClass("Oneline",R.drawable.economy,"Economic"))
            arrayList.add(ModelClass("Oneline",R.drawable.computer,"Computer"))
            arrayList.add(ModelClass("Oneline",R.drawable.reasoning,"Reasoning"))
        }
        else if (data=="Quiz"){
            arrayList.add(ModelClass("Quiz",R.drawable.history,"History"))
            arrayList.add(ModelClass("Quiz",R.drawable.geography,"Geography"))
            arrayList.add(ModelClass("Quiz",R.drawable.constitution,"Constitution"))
            arrayList.add(ModelClass("Quiz",R.drawable.science,"Science"))
            arrayList.add(ModelClass("Quiz",R.drawable.economy,"Economic"))
            arrayList.add(ModelClass("Quiz",R.drawable.computer,"Computer"))
            arrayList.add(ModelClass("Quiz",R.drawable.reasoning,"Reasoning"))
        }
        else if (data=="Trick"){
            arrayList.add(ModelClass("Trick",R.drawable.history,"History"))
            arrayList.add(ModelClass("Trick",R.drawable.geography,"Geography"))
            arrayList.add(ModelClass("Trick",R.drawable.constitution,"Constitution"))
            arrayList.add(ModelClass("Trick",R.drawable.science,"Science"))
            arrayList.add(ModelClass("Trick",R.drawable.economy,"Economic"))
            arrayList.add(ModelClass("Trick",R.drawable.computer,"Computer"))
            arrayList.add(ModelClass("Trick",R.drawable.reasoning,"Reasoning"))
        }

    }
}