package com.example.test.activity


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.modelclass.Modelclass_for_Qustion
import com.example.test.R
import com.example.test.adapterclass.adapterclass_for_Question

class Questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_questions)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val Recyclerview=findViewById<RecyclerView>(R.id.Recycler_question)


        val arrayList= arrayListOf<Modelclass_for_Qustion>()


        val adapterclass_for_Question= adapterclass_for_Question(this,arrayList)

        Recyclerview.adapter=adapterclass_for_Question
        Recyclerview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


                //get data from miniadapter
                val catagory=intent.getStringExtra("catagory")
                val minidata=intent.getStringExtra("minidata")

        //these all data get from miniadapter and show question according to Paragraphs category
        if (catagory=="Paragraphs History") {
            if (minidata == "first world war") {
                arrayList.add(Modelclass_for_Qustion("Paragraphs indian History1", "Q1. Paragraphs indian History"))
                arrayList.add(Modelclass_for_Qustion("Paragraphs indian History2", "Q2. Paragraphs indian History"))
                arrayList.add(Modelclass_for_Qustion("Paragraphs indian History3", "Q3. Paragraphs indian History"))
                arrayList.add(Modelclass_for_Qustion("Paragraphs indian History4", "Q4. Paragraphs indian History"))
            }
            else if (minidata == "first world war2") {
                arrayList.add(Modelclass_for_Qustion("Paragraphs world History1", "Q1. Paragraphs world History"))
            }

        }

        if (catagory=="Paragraphs Geography") {
            if (minidata == "सौर मंडल") {
                arrayList.add(Modelclass_for_Qustion("Paragraphs Geography1", "प्रश्न 1: हमारे सौर मंडल का सबसे बड़ा ग्रह कौन सा है?"))
                arrayList.add(Modelclass_for_Qustion("Paragraphs Geography2", "प्रश्न 2: हमारे सौर मंडल का सबसे गर्म ग्रह कौन सा है?"))
                arrayList.add(Modelclass_for_Qustion("Paragraphs Geography3", "प्रश्न 3: किस ग्रह के चंद्रमा सबसे अधिक हैं?"))
                arrayList.add(Modelclass_for_Qustion("Paragraphs Geography4", "प्रश्न 4: शनि के छल्लों की संरचना क्या है?"))
            }

        }

        if (catagory=="Paragraphs Constitution") {
            if (minidata == "Paragraphs Constitution") {
                arrayList.add(Modelclass_for_Qustion("Paragraphs world Geography1", "Q1. Paragraphs world Geography"))
            }

        }

        if (catagory=="Paragraphs Science") {
            if (minidata == "Paragraphs Science") {
                arrayList.add(Modelclass_for_Qustion("Paragraphs micro Economics1", "Q1. Paragraphs micro Economics"))
            }
        }

        if (catagory=="Paragraphs Economics") {
            if (minidata == "Paragraphs Economics") {
                arrayList.add(Modelclass_for_Qustion("Paragraphs macro Economics1", "Q1. Paragraphs macro Economics"))
            }
        }

        if (catagory=="Paragraphs Computer") {
            if (minidata == "Paragraphs Computer") {
                arrayList.add(Modelclass_for_Qustion("Paragraphs macro Economics1", "Q1. Paragraphs macro Economics"))
            }
        }

        if (catagory=="Paragraphs Reasoning") {
            if (minidata == "Paragraphs Reasoning") {
                arrayList.add(Modelclass_for_Qustion("Paragraphs macro Economics1", "Q1. Paragraphs macro Economics"))
            }
        }



        //these all data get from miniadapter and show question according to Oneline category
        if (catagory=="Oneline History") {
            if (minidata == "Oneline History") {
                arrayList.add(Modelclass_for_Qustion("Oneline indian History1", "Q1. Oneline indian History"))
            }
        }

        if (catagory=="Oneline Geography") {
            if (minidata == "सौर मंडल") {
                arrayList.add(Modelclass_for_Qustion("Oneline world History1", "Q1. Oneline world History"))
            }
        }

        if (catagory=="Oneline Constitution") {
            if (minidata == "Oneline Constitution") {
                arrayList.add(Modelclass_for_Qustion("Oneline indian Geography1", "Q1. Oneline indian Geography"))
            }
        }

        if (catagory=="Oneline Science") {
            if (minidata == "Oneline Science") {
                arrayList.add(Modelclass_for_Qustion("Oneline world Geography1", "Q1. Oneline world Geography"))
            }
        }

        if (catagory=="Oneline Economics") {
            if (minidata == "Oneline Economics") {
                arrayList.add(Modelclass_for_Qustion("Oneline micro Economics1", "Q1. Oneline micro Economics"))
            }
        }

        if (catagory=="Oneline Computer") {
            if (minidata == "Oneline Computer") {
                arrayList.add(Modelclass_for_Qustion("Oneline macro Economics1", "Q1. Oneline macro Economics"))
            }
        }

        if (catagory=="Oneline Reasoning") {
            if (minidata == "Oneline Reasoning") {
                arrayList.add(Modelclass_for_Qustion("Oneline macro Economics1", "Q1. Oneline macro Economics"))
            }
        }


        //these all data get from miniadapter and show question according to Quiz category
        if (catagory=="Quiz History") {
            if (minidata == "Quiz History") {
                arrayList.add(Modelclass_for_Qustion("Quiz indian History1", "Q1. Quiz indian History"))
            }
        }

        if (catagory=="Quiz Geography") {
            if (minidata == "सौर मंडल") {
                arrayList.add(Modelclass_for_Qustion("Quiz world History1", "Q1. Quiz world History"))
            }
        }

        if (catagory=="Quiz Constitution") {
            if (minidata == "Quiz Constitution") {
                arrayList.add(Modelclass_for_Qustion("Quiz indian Geography1", "Q1. Quiz indian Geography"))
            }
        }

        if (catagory=="Quiz Science") {
            if (minidata == "Quiz Science") {
                arrayList.add(Modelclass_for_Qustion("Quiz world Geography1", "Q1. Quiz world Geography"))
            }
        }

        if (catagory=="Quiz Economics") {
            if (minidata == "Quiz Economics") {
                arrayList.add(Modelclass_for_Qustion("Quiz micro Economics1", "Q1. Quiz micro Economics"))
            }
        }

        if (catagory=="Quiz Computer") {
            if (minidata == "Quiz Computer") {
                arrayList.add(Modelclass_for_Qustion("Quiz macro Economics1", "Q1. Quiz macro Economics"))
            }
        }

        if (catagory=="Quiz Reasoning") {
            if (minidata == "Quiz Reasoning") {
                arrayList.add(Modelclass_for_Qustion("Quiz Reasoning1", "Q1. Quiz Reasoning"))
            }
        }



        //these all data get from miniadapter and show question according to Trick category
        if (catagory=="Trick History") {
            if (minidata == "Trick History") {
                arrayList.add(Modelclass_for_Qustion("Trick indian History1", "Q1. Trick indian History"))
            }
        }

        if (catagory=="Trick Geography") {
            if (minidata == "सौर मंडल") {
                arrayList.add(Modelclass_for_Qustion("Trick world History1", "Q1. Trick world History"))
            }
        }

        if (catagory=="Trick Constitution") {
            if (minidata == "Trick Constitution") {
                arrayList.add(Modelclass_for_Qustion("Trick indian Geography1", "Q1. Trick indian Geography"))
            }
        }

        if (catagory=="Trick Science") {
            if (minidata == "Trick Science") {
                arrayList.add(Modelclass_for_Qustion("Trick world Geography1", "Q1. Trick world Geography"))
            }
        }

        if (catagory=="Trick Economics") {
            if (minidata == "Trick Economics") {
                arrayList.add(Modelclass_for_Qustion("Trick micro Economics1", "Q1. Trick micro Economics"))
            }
        }

        if (catagory=="Trick Computer") {
            if (minidata == "Trick Computer") {
                arrayList.add(Modelclass_for_Qustion("Trick macro Economics1", "Q1. Trick macro Economics"))
            }
        }

        if (catagory=="Trick Reasoning") {
            if (minidata == "Trick Reasoning") {
                arrayList.add(Modelclass_for_Qustion("Trick macro Economics1", "Q1. Trick macro Economics"))
            }
        }


    }
}