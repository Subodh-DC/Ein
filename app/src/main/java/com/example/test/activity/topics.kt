package com.example.test.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.modelclass.Model_for_topics
import com.example.test.R
import com.example.test.adapterclass.adapter_for_topics

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


        val array= arrayListOf<Model_for_topics>()


        val adapterForTopics= adapter_for_topics(this,array)

        val recyclerView=findViewById<RecyclerView>(R.id.Recycler_topics)
        recyclerView.adapter=adapterForTopics
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        //get data from recyclerview of adapterclass
        val data=intent.getStringExtra("data")

        /* val Paragraphs="Paragraphs"
       val Oneline="Oneline"
       val Quiz="Quiz"
       val Trick="Trick"*/

        //these all data for get key from adapter class and Paragraphs and add topics
        if (data=="Paragraphs History"){
            array.add(Model_for_topics(R.drawable.topic_history1,"Paragraphs History","1","first world war"))
            array.add(Model_for_topics(R.drawable.topic_history1,"Paragraphs History","2","first world war2"))
        }
        else if (data=="Paragraphs Geography"){
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","1","सौर मंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","2","पृथ्वी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","3","ब्रह्मांड"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","4","जलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","5","झीलें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","6","ज्वार भाटा"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","7","वायुमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","8","पवनें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","9","पृथ्वी की संरचना"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","10","पस्थलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","11","ज्वालामुखी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","12","पर्वत"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","13","भूकंप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","14","मरुस्थल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","15","पठार"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","16","एशिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","17","अफ्रीका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","18","यूरोप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","19","उत्तरी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","20","दक्षिणी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","21","ऑस्ट्रेलिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","22","अंटार्कटिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","23","विश्व के महासागर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","24","वभारत का भूगोल सामान्य परिचय"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","25","नदियों के किनारे बसे शहर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","26","भारत की जलवायु"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","27","भारत की नदियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","28","भारत की मिट्टियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","29","भारत की कृषि"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","30","भारत का भौतिक स्वरूप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","31","अभयारण/ राष्ट्रीय उद्यान"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","32","विश्व की प्रमुख जनजातियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","33","वराज्य और उसकी राजधानी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Paragraphs Geography","34","भारत में खनिज"))

        }
        else if (data=="Paragraphs Constitution"){
            array.add(Model_for_topics(R.drawable.topic_constitution1,"Paragraphs Constitution","1","Paragraphs Constitution"))

        }
        else if (data=="Paragraphs Science"){
            array.add(Model_for_topics(R.drawable.topic_science1,"Paragraphs Science","1","Paragraphs Science"))

        }
        else if (data=="Paragraphs Economics"){
            array.add(Model_for_topics(R.drawable.topic_economic3,"Paragraphs Economics","1","Paragraphs Economics"))

        }
        else if (data=="Paragraphs Computer"){
            array.add(Model_for_topics(R.drawable.topic_computer,"Paragraphs Computer","1","Paragraphs Computer"))

        }
        else if (data=="Paragraphs Reasoning"){
            array.add(Model_for_topics(R.drawable.topic_reasoning,"Paragraphs Reasoning","1","Paragraphs Reasoning"))

        }


        //these all data for get key from adapter class and Oneline and add topics
        if (data=="Oneline History"){
                    array.add(Model_for_topics(R.drawable.topic_history1,"Oneline History","1","Oneline History"))

                }
        else if (data=="Oneline Geography"){
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","1","सौर मंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","2","पृथ्वी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","3","ब्रह्मांड"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","4","जलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","5","झीलें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","6","ज्वार भाटा"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","7","वायुमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","8","पवनें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","9","पृथ्वी की संरचना"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","10","पस्थलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","11","ज्वालामुखी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","12","पर्वत"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","13","भूकंप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","14","मरुस्थल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","15","पठार"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","16","एशिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","17","अफ्रीका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","18","यूरोप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","19","उत्तरी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","20","दक्षिणी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","21","ऑस्ट्रेलिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","22","अंटार्कटिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","23","विश्व के महासागर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","24","वभारत का भूगोल सामान्य परिचय"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","25","नदियों के किनारे बसे शहर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","26","भारत की जलवायु"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","27","भारत की नदियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","28","भारत की मिट्टियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","29","भारत की कृषि"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","30","भारत का भौतिक स्वरूप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","31","अभयारण/ राष्ट्रीय उद्यान"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","32","विश्व की प्रमुख जनजातियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","33","वराज्य और उसकी राजधानी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Oneline Geography","34","भारत में खनिज"))

                }
        else if (data=="Oneline Constitution"){
                    array.add(Model_for_topics(R.drawable.topic_constitution1,"Oneline Constitution","1","Oneline Constitution"))

                }
        else if (data=="Oneline Science") {
                    array.add(Model_for_topics(R.drawable.topic_science1,"Oneline Science","1","Oneline Science"))

                }
        else if (data=="Oneline Economics") {
                    array.add(Model_for_topics(R.drawable.topic_economic3,"Oneline Economics","1","Oneline Economics"))

                }
        else if (data=="Oneline Computer") {
                    array.add(Model_for_topics(R.drawable.topic_computer,"Oneline Computer","1","Oneline Computer"))

                }
        else if (data=="Oneline Reasoning"){
                    array.add(Model_for_topics(R.drawable.topic_reasoning,"Oneline Reasoning","1","Oneline Reasoning"))

                }

        //these all data for get key from adapter class and Quiz and add topics
        if (data=="Quiz History"){
                    array.add(Model_for_topics(R.drawable.topic_history1,"Quiz History","1","Quiz History"))
                }
        else if (data=="Quiz Geography"){
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","1","सौर मंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","2","पृथ्वी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","3","ब्रह्मांड"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","4","जलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","5","झीलें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","6","ज्वार भाटा"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","7","वायुमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","8","पवनें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","9","पृथ्वी की संरचना"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","10","पस्थलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","11","ज्वालामुखी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","12","पर्वत"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","13","भूकंप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","14","मरुस्थल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","15","पठार"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","16","एशिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","17","अफ्रीका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","18","यूरोप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","19","उत्तरी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","20","दक्षिणी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","21","ऑस्ट्रेलिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","22","अंटार्कटिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","23","विश्व के महासागर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","24","वभारत का भूगोल सामान्य परिचय"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","25","नदियों के किनारे बसे शहर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","26","भारत की जलवायु"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","27","भारत की नदियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","28","भारत की मिट्टियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","29","भारत की कृषि"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","30","भारत का भौतिक स्वरूप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","31","अभयारण/ राष्ट्रीय उद्यान"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","32","विश्व की प्रमुख जनजातियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","33","वराज्य और उसकी राजधानी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Quiz Geography","34","भारत में खनिज"))

                }
        else if (data=="Quiz Constitution"){
                    array.add(Model_for_topics(R.drawable.topic_constitution1,"Quiz Constitution","1","Quiz Constitution"))

                }
        else if (data=="Quiz Science"){
                    array.add(Model_for_topics(R.drawable.topic_science1,"Quiz Science","1","Quiz Science"))

                }
        else if (data=="Quiz Economics"){
                    array.add(Model_for_topics(R.drawable.topic_economic3,"Quiz Economics","1","Quiz Economics"))

                }
        else if (data=="Quiz Computer"){
                    array.add(Model_for_topics(R.drawable.topic_computer,"Quiz Computer","1","Quiz Computer"))

                }
        else if (data=="Quiz Reasoning"){
                    array.add(Model_for_topics(R.drawable.topic_reasoning,"Quiz Reasoning","1","Quiz Reasoning"))

                }

        //these all data for get key from adapter class and Trick and add topics
        if (data=="Trick History"){
                    array.add(Model_for_topics(R.drawable.topic_history1,"Trick History","1","Trick History"))
                }
        else if (data=="Trick Geography"){
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","1","सौर मंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","2","पृथ्वी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","3","ब्रह्मांड"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","4","जलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","5","झीलें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","6","ज्वार भाटा"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","7","वायुमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","8","पवनें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","9","पृथ्वी की संरचना"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","10","पस्थलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","11","ज्वालामुखी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","12","पर्वत"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","13","भूकंप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","14","मरुस्थल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","15","पठार"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","16","एशिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","17","अफ्रीका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","18","यूरोप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","19","उत्तरी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","20","दक्षिणी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","21","ऑस्ट्रेलिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","22","अंटार्कटिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","23","विश्व के महासागर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","24","वभारत का भूगोल सामान्य परिचय"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","25","नदियों के किनारे बसे शहर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","26","भारत की जलवायु"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","27","भारत की नदियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","28","भारत की मिट्टियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","29","भारत की कृषि"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","30","भारत का भौतिक स्वरूप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","31","अभयारण/ राष्ट्रीय उद्यान"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","32","विश्व की प्रमुख जनजातियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","33","वराज्य और उसकी राजधानी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"Trick Geography","34","भारत में खनिज"))

                }
        else if (data=="Trick Constitution"){
                    array.add(Model_for_topics(R.drawable.topic_constitution1,"Trick Constitution","1","Trick Constitution"))

                }
        else if (data=="Trick Science"){
                    array.add(Model_for_topics(R.drawable.topic_science1,"Trick Science","1","Trick Science"))

                }
        else if (data=="Trick Economics"){
                    array.add(Model_for_topics(R.drawable.topic_economic3,"Trick Economics","1","Trick Economics"))

                }
        else if (data=="Trick Computer"){
                    array.add(Model_for_topics(R.drawable.topic_computer,"Trick Computer","1","Trick Computer"))

                }
        else if (data=="Trick Reasoning"){
                    array.add(Model_for_topics(R.drawable.topic_reasoning,"Trick Reasoning","1","Trick Reasoning"))

                }


    }
}