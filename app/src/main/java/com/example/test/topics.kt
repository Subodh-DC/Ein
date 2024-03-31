package com.example.test

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class topics : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_topics)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val number=findViewById<TextView>(R.id.topicsnumber)
        val topic=findViewById<TextView>(R.id.topicstext)

        val array= arrayListOf<Model_for_topics>()


        val adapterForTopics=adapter_for_topics(this,array)

        val recyclerView=findViewById<RecyclerView>(R.id.Recycler_topics)
        recyclerView.adapter=adapterForTopics
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        //get data from recyclerview of adapterclass
        val data=intent.getStringExtra("data")

        /* val Paragraphs="Paragraphs"
       val Oneline="Oneline"
       val Quiz="Quiz"
       val Trick="Trick"*/

        //these all data for get key from adapter class and Paragraphs
        if (data=="Paragraphs History"){
            array.add(Model_for_topics("Paragraphs History","1","first world war"))
            array.add(Model_for_topics("Paragraphs History","2","first world war2"))
        }
        else if (data=="Paragraphs Geography"){
            array.add(Model_for_topics("Paragraphs Geography","1","Indian Geography"))

        }
        else if (data=="Paragraphs Constitution"){
            array.add(Model_for_topics("Paragraphs Constitution","1","Paragraphs Constitution"))

        }

        else if (data=="Paragraphs Science"){
            array.add(Model_for_topics("Paragraphs Science","1","Paragraphs Science"))

        }
        else if (data=="Paragraphs Economics"){
            array.add(Model_for_topics("Paragraphs Economics","1","Economics"))

        }

        else if (data=="Paragraphs Computer"){
            array.add(Model_for_topics("Paragraphs Computer","1","Paragraphs Computer"))

        }

        else if (data=="Paragraphs Reasoning"){
            array.add(Model_for_topics("Paragraphs Reasoning","1","Paragraphs Reasoning"))

        }


        //these all data for get key from adapter class and Oneline
        if (data=="Oneline History"){
            array.add(Model_for_topics("Oneline History","1","Oneline History"))

        }
        else if (data=="Oneline Geography"){
            array.add(Model_for_topics("Oneline Geography","1","Oneline Geography"))

        }
        else if (data=="Oneline Constitution"){
            array.add(Model_for_topics("Oneline Constitution","1","Oneline Constitution"))

        }
        else if (data=="Oneline Science") {
            array.add(Model_for_topics("Oneline Science","1","Oneline Science"))

        }
        else if (data=="Oneline Economics") {
            array.add(Model_for_topics("Oneline Economics","1","Oneline Economics"))

        }
        else if (data=="Oneline Computer") {
            array.add(Model_for_topics("Oneline Computer","1","Oneline Computer"))

        }
        else if (data=="Oneline Reasoning"){
            array.add(Model_for_topics("Oneline Reasoning","1","Oneline Reasoning"))

        }

        //these all data for get key from adapter class and Quiz
        if (data=="Quiz History"){
            array.add(Model_for_topics("Quiz History","1","Quiz History"))
        }
        else if (data=="Quiz Geography"){
            array.add(Model_for_topics("Quiz Geography","1","Quiz Geography"))

        }
        else if (data=="Quiz Constitution"){
            array.add(Model_for_topics("Quiz Constitution","1","Quiz Constitution"))

        }
        else if (data=="Quiz Science"){
            array.add(Model_for_topics("Quiz Science","1","Quiz Science"))

        }
        else if (data=="Quiz Economics"){
            array.add(Model_for_topics("Quiz Economics","1","Quiz Economics"))

        }
        else if (data=="Quiz Computer"){
            array.add(Model_for_topics("Quiz Computer","1","Quiz Computer"))

        }
        else if (data=="Quiz Reasoning"){
            array.add(Model_for_topics("Quiz Reasoning","1","Quiz Reasoning"))

        }

        //these all data for get key from adapter class and Trick
        if (data=="Trick History"){
            array.add(Model_for_topics("Trick History","1","Trick History"))
        }
        else if (data=="Trick Geography"){
            array.add(Model_for_topics("Trick Geography","1","Trick Geography"))

        }
        else if (data=="Trick Constitution"){
            array.add(Model_for_topics("Trick Constitution","1","Trick Constitution"))

        }
        else if (data=="Trick Science"){
            array.add(Model_for_topics("Trick Science","1","Trick Science"))

        }
        else if (data=="Trick Economics"){
            array.add(Model_for_topics("Trick Economics","1","Trick Economics"))

        }
        else if (data=="Trick Computer"){
            array.add(Model_for_topics("Trick Computer","1","Trick Computer"))

        }
        else if (data=="Trick Reasoning"){
            array.add(Model_for_topics("Trick Reasoning","1","Trick Reasoning"))

        }


    }
}