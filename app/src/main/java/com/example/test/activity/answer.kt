package com.example.test.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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

        //these all question of Paragraphs Geography
        if (data=="प्रश्न 1: हमारे सौर मंडल का सबसे बड़ा ग्रह कौन सा है?"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="उत्तर: हमारे सौर मंडल का सबसे बड़ा ग्रह बृहस्पति है। लगभग 86,881 मील (139,822 किलोमीटर) के व्यास में फैले बृहस्पति का विशाल आकार मुख्य रूप से इसकी संरचना के कारण है, जिसमें ज्यादातर हाइड्रोजन और हीलियम गैसें शामिल हैं। इसका विशाल द्रव्यमान, पृथ्वी से लगभग 318 गुना अधिक, इतना शक्तिशाली गुरुत्वाकर्षण खिंचाव पैदा करता है कि यह पड़ोसी ग्रहों और खगोलीय पिंडों की कक्षाओं को प्रभावित करता है। बृहस्पति की प्रतिष्ठित विशेषता, ग्रेट रेड स्पॉट, एक विशाल तूफान प्रणाली है जो इसके वायुमंडल में सदियों से भड़क रही है, जो ग्रह की गतिशील और अशांत प्रकृति पर जोर देती है।"
        }
        else if (data=="प्रश्न 2: हमारे सौर मंडल का सबसे गर्म ग्रह कौन सा है?"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="उत्तर: शुक्र को हमारे सौरमंडल का सबसे गर्म ग्रह होने का गौरव प्राप्त है। सूर्य के निकटतम ग्रह न होने के बावजूद, मुख्य रूप से कार्बन डाइऑक्साइड से बना इसका घना वातावरण गर्मी को प्रभावी ढंग से रोक लेता है, जिसके परिणामस्वरूप अत्यधिक ग्रीनहाउस प्रभाव होता है। शुक्र पर सतह का तापमान औसतन 900 डिग्री फ़ारेनहाइट (475 डिग्री सेल्सियस) तक बढ़ जाता है, जो सीसा पिघलाने के लिए पर्याप्त गर्म है। इसके घने वातावरण और तीव्र गर्मी का संयोजन एक प्रतिकूल वातावरण बनाता है, जिससे शुक्र अन्वेषण के लिए एक चुनौतीपूर्ण गंतव्य बन जाता है।"
        }
        else if (data=="प्रश्न 3: किस ग्रह के चंद्रमा सबसे अधिक हैं?"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="उत्तर: हमारे सौर मंडल में सबसे अधिक चंद्रमा होने का सम्मान गैस के विशालकाय बृहस्पति को है। 79 से अधिक पुष्ट चंद्रमाओं की चौंका देने वाली गिनती के साथ, बृहस्पति के उपग्रहों का व्यापक परिवार आकार, संरचना और कक्षा में काफी भिन्न है। इसके उल्लेखनीय चंद्रमाओं में चार सबसे बड़े चंद्रमा हैं जिन्हें गैलिलियन चंद्रमाओं के रूप में जाना जाता है - आयो, यूरोपा, गेनीमेड और कैलिस्टो - प्रत्येक में अद्वितीय विशेषताएं और विशेषताएं हैं। बृहस्पति का गुरुत्वाकर्षण प्रभाव इसे कई छोटी वस्तुओं को पकड़ने और बनाए रखने की अनुमति देता है, जो इसके चंद्रमा प्रणाली की विविधता में योगदान देता है।"
        }
        else if (data=="प्रश्न 4: शनि के छल्लों की संरचना क्या है?"){
            image.setImageResource(R.drawable.amitabh)
            question.text="$data"
            answer.text="उत्तर: शनि के भव्य छल्लों में मुख्य रूप से बर्फ के कण, साथ ही थोड़ी मात्रा में चट्टानी मलबे और धूल शामिल हैं। इन कणों का आकार अलग-अलग होता है, छोटे दानों से लेकर बड़े पत्थरों तक। अपनी अलौकिक उपस्थिति के बावजूद, छल्ले उल्लेखनीय रूप से पतले हैं, अधिकांश स्थानों पर उनकी मोटाई केवल 30 फीट (10 मीटर) है। वे शनि के भूमध्य रेखा से बाहर की ओर हजारों किलोमीटर तक फैले हुए हैं, जिससे एक मामूली दूरबीन से भी पृथ्वी से दिखाई देने वाला आश्चर्यजनक दृश्य दिखाई देता है। शनि के छल्लों की उत्पत्ति वैज्ञानिक जांच का विषय बनी हुई है, सिद्धांतों से पता चलता है कि वे टूटे हुए चंद्रमा के अवशेष या ग्रह के निर्माण से बचे हुए पदार्थ हो सकते हैं।"
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


    /*    //Quiz category
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
        }*/

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