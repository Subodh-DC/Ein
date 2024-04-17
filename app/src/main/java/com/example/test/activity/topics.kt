package com.example.test.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test.modelclass.Model_for_topics
import com.example.test.R
import com.example.test.adapterclass.adapter_for_topics
import com.example.test.interfac.RecyclerViewClick

class topics : AppCompatActivity(),RecyclerViewClick {
    lateinit var data:String
    var array= arrayListOf<Model_for_topics>()
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


        val adapterForTopics= adapter_for_topics(this,array,this)

        val recyclerView=findViewById<RecyclerView>(R.id.Recycler_topics)
        recyclerView.adapter=adapterForTopics
        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        //get data from recyclerview of adapterclass
         data= intent.getStringExtra("data").toString()


        //this is to add data in array
        addTopicsinarray()

        /* val Paragraphs="Paragraphs"
       val Oneline="Oneline"
       val Quiz="Quiz"
       val Trick="Trick"*/

    }

    private fun addTopicsinarray() {
        if (data == "Paragraphs History" || data=="Oneline History" || data=="Quiz History" || data=="Trick History"){
            array.add(Model_for_topics(R.drawable.topic_history1,"1","अमेरिका का स्वतंत्रता संग्राम"))
            array.add(Model_for_topics(R.drawable.topic_history1,"2","फ्रांस की राज्यक्रांति"))
            array.add(Model_for_topics(R.drawable.topic_history1,"3","इटली का एकीकरण"))
            array.add(Model_for_topics(R.drawable.topic_history1,"4","जर्मनी का एकीकरण"))
            array.add(Model_for_topics(R.drawable.topic_history1,"5","रूस की क्रांति"))
            array.add(Model_for_topics(R.drawable.topic_history1,"6","औद्योगिक क्रांति"))
            array.add(Model_for_topics(R.drawable.topic_history1,"7","प्रथम विश्वयुद्ध"))
            array.add(Model_for_topics(R.drawable.topic_history1,"8","दुसरा विश्व युद्ध"))
            array.add(Model_for_topics(R.drawable.topic_history1,"9","बंगाल के गवर्नर"))
            array.add(Model_for_topics(R.drawable.topic_history1,"10","भारत के गवर्नर जनरल"))
            array.add(Model_for_topics(R.drawable.topic_history1,"11","भारत के वायसराय"))
            array.add(Model_for_topics(R.drawable.topic_history1,"12","महान क्रांति"))
            array.add(Model_for_topics(R.drawable.topic_history1,"13","सामाजिक-धार्मिक आंदोलन"))
            array.add(Model_for_topics(R.drawable.topic_history1,"14","आंदोलन, घटनाएं और वर्ष"))
            array.add(Model_for_topics(R.drawable.topic_history1,"15","स्वतंत्रता संघर्ष"))
            array.add(Model_for_topics(R.drawable.topic_history1,"16","प्रमुख वचन और नारे"))
            array.add(Model_for_topics(R.drawable.topic_history1,"17","गुलाम वंश"))
            array.add(Model_for_topics(R.drawable.topic_history1,"18","खिलजी वंश"))
            array.add(Model_for_topics(R.drawable.topic_history1,"19","तुगलक वंश"))
            array.add(Model_for_topics(R.drawable.topic_history1,"20","धार्मिक आंदोलन"))
            array.add(Model_for_topics(R.drawable.topic_history1,"21","मराठा साम्राज्य"))
            array.add(Model_for_topics(R.drawable.topic_history1,"22","सिख शक्ति"))
            array.add(Model_for_topics(R.drawable.topic_history1,"23","मराठा साम्राज्य"))
            array.add(Model_for_topics(R.drawable.topic_history1,"24","सिख शक्ति"))
            array.add(Model_for_topics(R.drawable.topic_history1,"25","बाबर"))
            array.add(Model_for_topics(R.drawable.topic_history1,"26","हुमायूं"))
            array.add(Model_for_topics(R.drawable.topic_history1,"27","अकबर"))
            array.add(Model_for_topics(R.drawable.topic_history1,"28","जहांगीर"))
            array.add(Model_for_topics(R.drawable.topic_history1,"29","शाहजहां"))
            array.add(Model_for_topics(R.drawable.topic_history1,"30","औरंगजेब"))
            array.add(Model_for_topics(R.drawable.topic_history1,"31","हड़प्पा सभ्यता"))
            array.add(Model_for_topics(R.drawable.topic_history1,"32","वैदिक साहित्य"))
            array.add(Model_for_topics(R.drawable.topic_history1,"33","मौर्य व गुप्त काल"))


        }
        else if (data == "Paragraphs Geography" || data=="Oneline Geography" || data=="Quiz Geography" || data=="Trick Geography"){
            array.add(Model_for_topics(R.drawable.topic_geography1,"1","सौर मंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"2","पृथ्वी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"3","जलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"4","झीलें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"5","ज्वार भाटा"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"6","वायुमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"7","पवनें"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"8","पृथ्वी की संरचना"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"9","पस्थलमंडल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"10","ज्वालामुखी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"11","पर्वत"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"12","भूकंप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"13","मरुस्थल"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"14","पठार"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"15","एशिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"16","अफ्रीका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"17","यूरोप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"18","उत्तरी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"19","दक्षिणी अमेरिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"20","ऑस्ट्रेलिया"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"21","अंटार्कटिका"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"22","विश्व के महासागर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"23","वभारत का भूगोल सामान्य परिचय"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"24","नदियों के किनारे बसे शहर"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"25","भारत की जलवायु"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"26","भारत की नदियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"27","भारत की मिट्टियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"28","भारत की कृषि"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"29","भारत का भौतिक स्वरूप"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"30","अभयारण/ राष्ट्रीय उद्यान"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"31","विश्व की प्रमुख जनजातियां"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"32","वराज्य और उसकी राजधानी"))
            array.add(Model_for_topics(R.drawable.topic_geography1,"33","भारत में खनिज"))

        }
        else if (data == "Paragraphs Constitution" || data=="Oneline Constitution" || data=="Quiz Constitution" || data=="Trick Constitution"){
            array.add(Model_for_topics(R.drawable.topic_constitution1,"1","भारत का संवैधानिक इतिहास"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"2","संविधान सभा"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"3","संविधान की प्रस्तावना"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"4","संविधान की विशेषताएं"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"5","संविधान के स्त्रोत"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"6","संविधान के भाग"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"7","संविधान की अनुसूचियां"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"8","संविधान के अनुच्छेद"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"9","संघ और उसके राज्य क्षेत्र"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"10","नागरिकता"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"11","मूल अधिकार"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"12","राज्य के नीति निर्देशक तत्व"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"13","मूल कर्तव्य"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"14","भारतीय संसद"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"15","राष्ट्रपति"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"16","उपराष्ट्रपति"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"16","राज्यसभा"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"17","लोकसभा"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"18","प्रधानमंत्री"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"19","संघीय मंत्रिपरिषद"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"20","संसदीय समितियां"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"21","सर्वोच्च न्यायालय"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"22","उच्च न्यायालय"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"23","राज्यपाल"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"24","मुख्यमंत्री"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"25","विधान परिषद्"))
            array.add(Model_for_topics(R.drawable.topic_constitution1,"26","विधानसभा"))

        }
        else if (data == "Paragraphs Science" || data=="Oneline Science" || data=="Quiz Science" || data=="Trick Science") {
            array.add(Model_for_topics(R.drawable.topic_science1,"1","गति और गति विज्ञान (Motion and Kinematics)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"2","बल और गतिशीलता (Force and Dynamics)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"3","ऊर्जा और कार्य (Energy and Work)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"4","गर्मी और ताप (Heat and Thermodynamics)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"5","आधुनिक भौतिकी (Modern Physics)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"6","विद्युत विज्ञान (Electricity and Magnetism)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"7","ध्वनि और अपवाद (Sound and Waves)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"8","प्रकाश और प्रकाशिकी (Light and Optics)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"9","ऊतक संरचना और कार्य (Cell Structure and Function)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"10","प्राणियों की आनुवंशिकता (Genetics in Organisms)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"11","पारगमन और परिपाटी (Reproduction and Development)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"12","जैव एवं उनके विभाजन (Life and its Classification)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"13","संजीव प्रणाली (Ecosystem)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"14","जीवविज्ञान में शिक्षा (Education in Biology)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"15","जन्तु विज्ञान (Zoology)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"16","वनस्पति जीवविज्ञान (Botany)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"17","जैव-प्रौद्योगिकी (Biotechnology)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"18","पर्यावरण और जीवविज्ञान (Environment and Biology)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"19","रासायनिक अभिक्रिया और अभिक्रियाशास्त्र (Chemical Reactions and Stoichiometry)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"20","आणविक योजना और आणविक संरचना (Atomic Structure and Chemical Bonding)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"21","अम्ल और शारीरिक रसायन (Acids and Physical Chemistry)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"22","आधुनिक रासायनिक अभिक्रियाएँ (Modern Chemical Reactions)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"23","उत्तेजन (Thermodynamics)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"24","उपचारिक रसायन (Inorganic Chemistry)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"25","संघटनात्मक रसायन (Organic Chemistry)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"26","अद्वितीय रसायन और संश्लेषण (Special Chemistry and Mixtures)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"27","आयनिक आणविकता (Ionic Equilibrium)"))
            array.add(Model_for_topics(R.drawable.topic_science1,"28","उपाद्य एवं तत्त्व (Elements and Principles)"))

        }
        else if (data == "Paragraphs Economics" || data=="Oneline Economics" || data=="Quiz Economics" || data=="Trick Economics") {
            array.add(Model_for_topics(R.drawable.topic_economic3,"1","अर्थशास्त्र की परिभाषा (Definition of Economics)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"2","आय और राजस्व (Income and Revenue)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"3","उत्पादन (Production)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"4","उत्पादकता (Productivity)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"5","बाजार (Market)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"6","मूल्य निर्धारण (Price Determination)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"7","निर्यात और आयात (Export and Import)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"8","बैंकिंग और वित्तीय बाजार (Banking and Financial Market)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"9","नौकरी और बेरोजगारी (Employment and Unemployment)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"10","सामाजिक और आर्थिक न्याय (Social and Economic Justice)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"11","अधिकृत और गैर-अधिकृत बाजार (Formal and Informal Markets)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"12","आय वितरण (Income Distribution)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"13","व्यक्तिगत और सार्वजनिक खर्च (Personal and Public Expenditure)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"14","उत्पादन विकास (Production Development)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"15","नियोजन (Planning)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"16","सार्वजनिक नीति (Public Policy)"))
            array.add(Model_for_topics(R.drawable.topic_economic3,"17","विपणन (Marketing)"))

        }
        else if (data == "Paragraphs Computer" || data=="Oneline Computer" || data=="Quiz Computer" || data=="Trick Computer") {
            array.add(Model_for_topics(R.drawable.topic_computer,"1","कंप्यूटर का इतिहास (History of Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"2","कंप्यूटर के प्रकार (Types of Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"3","कंप्यूटर के प्रमुख अंग (Major Components of a Computer)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"4","कंप्यूटर की कार्यावस्था (Computer Operations)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"5","कंप्यूटर के ऑपरेटिंग सिस्टम (Computer Operating Systems)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"6","कंप्यूटर नेटवर्किंग (Computer Networking)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"7","कंप्यूटर के महत्वपूर्ण सॉफ़्टवेयर (Important Software Programs)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"8","कंप्यूटर सुरक्षा (Computer Security)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"9","कंप्यूटर में डेटा संरक्षण (Data Protection in Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"10","कंप्यूटर के उपयोग (Uses of Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"11","कंप्यूटर के लिए महत्वपूर्ण तकनीकी शब्दावली (Important Technical Terminology for Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"12","कंप्यूटर में अनुप्रयोग विकास (Application Development in Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"13","कंप्यूटर भाषाएँ (Computer Languages)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"14","कंप्यूटर में हार्डवेयर और सॉफ़्टवेयर (Hardware and Software in Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"15","कंप्यूटर संगणना (Computer Computing)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"16","कंप्यूटर में इंटरनेट का उपयोग (Internet Usage on Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"17","कंप्यूटर संबंधित महत्वपूर्ण वेबसाइट्स और ब्लॉग्स (Important Websites and Blogs Related to Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"18","कंप्यूटर में डिजिटल माध्यम (Digital Media on Computers)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"19","कंप्यूटर में गतिशीलता (Computer Speed and Performance)"))
            array.add(Model_for_topics(R.drawable.topic_computer,"20","कंप्यूटर रिपेयर और मेंटेनेंस (Computer Repair and Maintenance)"))


        }
        else if (data == "Paragraphs Reasoning" || data=="Oneline Reasoning" || data=="Quiz Reasoning" || data=="Trick Reasoning"){
            array.add(Model_for_topics(R.drawable.topic_reasoning,"1","Oneline Reasoning"))

        }
    }

    override fun onIntemClicked(position: Int) {
        val intent = Intent(this, Questions::class.java)
        intent.putExtra("catagory",data)
        intent.putExtra("minidata", array[position].topic)
        startActivity(intent)
    }

}