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
                val minidata=intent.getStringExtra("minidata")

                //these all data get from miniadapter and show question according to Paragraphs category
                if (minidata=="first world war"){
                    arrayList.add(Modelclass_for_Qustion("Paragraphs indian History1","Q1. Paragraphs indian History"))
                    arrayList.add(Modelclass_for_Qustion("Paragraphs indian History2","Q2. Paragraphs indian History"))
                    arrayList.add(Modelclass_for_Qustion("Paragraphs indian History3","Q3. Paragraphs indian History"))
                }
                else if (minidata=="first world war2"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs world History1","Q1. Paragraphs world History"))
        }
                else if (minidata=="Paragraphs Indian Geography"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs indian Geography1","Q1. Paragraphs Indian Geography"))
        }
                else if (minidata=="Paragraphs Constitution"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs world Geography1","Q1. Paragraphs world Geography"))
        }
                else if (minidata=="Paragraphs Science"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs micro Economics1","Q1. Paragraphs micro Economics"))
        }
                else if (minidata=="Paragraphs Economics"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs macro Economics1","Q1. Paragraphs macro Economics"))
        }
                else if (minidata=="Paragraphs Computer"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs macro Economics1","Q1. Paragraphs macro Economics"))
        }
                else if (minidata=="Paragraphs Reasoning"){
            arrayList.add(Modelclass_for_Qustion("Paragraphs macro Economics1","Q1. Paragraphs macro Economics"))
        }


               //these all data get from miniadapter and show question according to Oneline category
               if (minidata=="Oneline History"){
                   arrayList.add(Modelclass_for_Qustion("Oneline indian History1","Q1. Oneline indian History"))
               }
               else if (minidata=="Oneline Geography"){
                   arrayList.add(Modelclass_for_Qustion("Oneline world History1","Q1. Oneline world History"))
               }
               else if (minidata=="Oneline Constitution"){
                   arrayList.add(Modelclass_for_Qustion("Oneline indian Geography1","Q1. Oneline indian Geography"))
               }
               else if (minidata=="Oneline Science"){
                   arrayList.add(Modelclass_for_Qustion("Oneline world Geography1","Q1. Oneline world Geography"))
               }
               else if (minidata=="Oneline Economics"){
                   arrayList.add(Modelclass_for_Qustion("Oneline micro Economics1","Q1. Oneline micro Economics"))
               }
               else if (minidata=="Oneline Computer"){
                   arrayList.add(Modelclass_for_Qustion("Oneline macro Economics1","Q1. Oneline macro Economics"))
               }
               else if (minidata=="Oneline Reasoning"){
                   arrayList.add(Modelclass_for_Qustion("Oneline macro Economics1","Q1. Oneline macro Economics"))
               }


               //these all data get from miniadapter and show question according to Quiz category
               if (minidata=="Quiz History"){
                   arrayList.add(Modelclass_for_Qustion("Quiz indian History1","Q1. Quiz indian History"))
               }
               else if (minidata=="Quiz Geography"){
                   arrayList.add(Modelclass_for_Qustion("Quiz world History1","Q1. Quiz world History"))
               }
               else if (minidata=="Quiz Constitution"){
                   arrayList.add(Modelclass_for_Qustion("Quiz indian Geography1","Q1. Quiz indian Geography"))
               }
               else if (minidata=="Quiz Science"){
                   arrayList.add(Modelclass_for_Qustion("Quiz world Geography1","Q1. Quiz world Geography"))
               }
               else if (minidata=="Quiz Economics"){
                   arrayList.add(Modelclass_for_Qustion("Quiz micro Economics1","Q1. Quiz micro Economics"))
               }
               else if (minidata=="Quiz Computer"){
                   arrayList.add(Modelclass_for_Qustion("Quiz macro Economics1","Q1. Quiz macro Economics"))
               }
               else if (minidata=="Quiz Reasoning"){
                   arrayList.add(Modelclass_for_Qustion("Quiz macro Economics1","Q1. Quiz macro Economics"))
               }


                //these all data get from miniadapter and show question according to Trick category
                if (minidata=="Trick History"){
                    arrayList.add(Modelclass_for_Qustion("Trick indian History1","Q1. Trick indian History"))
                }
                else if (minidata=="Trick Geography"){
                    arrayList.add(Modelclass_for_Qustion("Trick world History1","Q1. Trick world History"))
                }
                else if (minidata=="Trick Constitution"){
                    arrayList.add(Modelclass_for_Qustion("Trick indian Geography1","Q1. Trick indian Geography"))
                }
                else if (minidata=="Trick Science"){
                    arrayList.add(Modelclass_for_Qustion("Trick world Geography1","Q1. Trick world Geography"))
                }
                else if (minidata=="Trick Economics"){
                    arrayList.add(Modelclass_for_Qustion("Trick micro Economics1","Q1. Trick micro Economics"))
                }
                else if (minidata=="Trick Computer"){
                    arrayList.add(Modelclass_for_Qustion("Trick macro Economics1","Q1. Trick macro Economics"))
                }
                else if (minidata=="Trick Reasoning"){
                    arrayList.add(Modelclass_for_Qustion("Trick macro Economics1","Q1. Trick macro Economics"))
                }

    }
}