package com.example.test.adapterclass

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.activity.Questions
import com.example.test.activity.topics
import com.example.test.modelclass.Model_for_topics

class adapter_for_topics(val context: Context,val arrayList: ArrayList<Model_for_topics>):
    RecyclerView.Adapter<adapter_for_topics.mytopic>() {
    class mytopic(view: View):RecyclerView.ViewHolder(view) {

        val number=view.findViewById<TextView>(R.id.topicsnumber)
        val topics=view.findViewById<TextView>(R.id.topicstext)
        val topicsdesignLayout: ViewGroup = view.findViewById(R.id.topics_layout)
        val topics_background=view.findViewById<ImageView>(R.id.topics_imageview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mytopic {
        return mytopic(LayoutInflater.from(context).inflate(R.layout.design_for_topics, null, false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: mytopic, position: Int) {

        val modelclass=arrayList[position]
        holder.number.text=modelclass.number
        holder.topics.text=modelclass.topic
        holder.topics_background.setImageResource(modelclass.background)

        holder.topicsdesignLayout.setOnClickListener {

            /* val Paragraphs="Paragraphs"
               val Oneline="Oneline"
               val Quiz="Quiz"
               val Trick="Trick"*/

            // this all data for go to question activity if user click Paragraphs category
            if (arrayList[position].catacory=="Paragraphs History"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
                else if (position==28){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[28].topic)
                    context.startActivity(intent)
                }
                else if (position==29){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[29].topic)
                    context.startActivity(intent)
                }
                else if (position==30){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[30].topic)
                    context.startActivity(intent)
                }
                else if (position==31){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[31].topic)
                    context.startActivity(intent)
                }
                else if (position==32){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[32].topic)
                    context.startActivity(intent)
                }


            }
            else if (arrayList[position].catacory=="Paragraphs Geography"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
                else if (position==28){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[28].topic)
                    context.startActivity(intent)
                }
                else if (position==29){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[29].topic)
                    context.startActivity(intent)
                }
                else if (position==30){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[30].topic)
                    context.startActivity(intent)
                }
                else if (position==31){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[31].topic)
                    context.startActivity(intent)
                }
                else if (position==32){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[32].topic)
                    context.startActivity(intent)
                }

            }
            else if (arrayList[position].catacory=="Paragraphs Constitution"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }

            }
            else if (arrayList[position].catacory=="Paragraphs Science"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }


            }
            else if (arrayList[position].catacory=="Paragraphs Economics"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }

            }
            else if (arrayList[position].catacory=="Paragraphs Computer"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }

            }
            else if (arrayList[position].catacory=="Paragraphs Reasoning"){
                if (position==0){
                    val intent = Intent(context,Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
            }



            // this all data for go to question activity if user click Oneline category
            if (arrayList[position].catacory=="Oneline History"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
                else if (position==28){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[28].topic)
                    context.startActivity(intent)
                }
                else if (position==29){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[29].topic)
                    context.startActivity(intent)
                }
                else if (position==30){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[30].topic)
                    context.startActivity(intent)
                }
                else if (position==31){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[31].topic)
                    context.startActivity(intent)
                }
                else if (position==32){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[32].topic)
                    context.startActivity(intent)
                }

            }
            else if (arrayList[position].catacory=="Oneline Geography"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
                else if (position==28){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[28].topic)
                    context.startActivity(intent)
                }
                else if (position==29){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[29].topic)
                    context.startActivity(intent)
                }
                else if (position==30){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[30].topic)
                    context.startActivity(intent)
                }
                else if (position==31){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[31].topic)
                    context.startActivity(intent)
                }
                else if (position==32){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[32].topic)
                    context.startActivity(intent)
                }

            }
            else if (arrayList[position].catacory=="Oneline Constitution"){
                  if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                  else if (position==26){
                      val intent = Intent(context, Questions::class.java)
                      intent.putExtra("catagory",arrayList[position].catacory)
                      intent.putExtra("minidata", arrayList[26].topic)
                      context.startActivity(intent)
                  }

              }
            else if (arrayList[position].catacory=="Oneline Science"){
                  if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
              }
            else if (arrayList[position].catacory=="Oneline Economics"){
                  if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
              }
            else if (arrayList[position].catacory=="Oneline Computer"){
                   if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
              }
            else if (arrayList[position].catacory=="Oneline Reasoning"){
                  if (position==0){
                      val intent = Intent(context,Questions::class.java)
                      intent.putExtra("catagory",arrayList[position].catacory)
                      intent.putExtra("minidata", arrayList[0].topic)
                      context.startActivity(intent)
                  }
              }


            // this all data for go to question activity if user click Quiz category
            if (arrayList[position].catacory=="Quiz History"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
                else if (position==28){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[28].topic)
                    context.startActivity(intent)
                }
                else if (position==29){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[29].topic)
                    context.startActivity(intent)
                }
                else if (position==30){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[30].topic)
                    context.startActivity(intent)
                }
                else if (position==31){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[31].topic)
                    context.startActivity(intent)
                }
                else if (position==32){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[32].topic)
                    context.startActivity(intent)
                }

            }
            else if (arrayList[position].catacory=="Quiz Geography"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
                else if (position==28){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[28].topic)
                    context.startActivity(intent)
                }
                else if (position==29){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[29].topic)
                    context.startActivity(intent)
                }
                else if (position==30){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[30].topic)
                    context.startActivity(intent)
                }
                else if (position==31){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[31].topic)
                    context.startActivity(intent)
                }
                else if (position==32){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[32].topic)
                    context.startActivity(intent)
                }

            }
             else if (arrayList[position].catacory=="Quiz Constitution"){
                 if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                 else if (position==26){
                     val intent = Intent(context, Questions::class.java)
                     intent.putExtra("catagory",arrayList[position].catacory)
                     intent.putExtra("minidata", arrayList[26].topic)
                     context.startActivity(intent)
                 }

             }
             else if (arrayList[position].catacory=="Quiz Science"){
                 if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
             }
             else if (arrayList[position].catacory=="Quiz Economics"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
             }
             else if (arrayList[position].catacory=="Quiz Computer"){
                  if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
             }
             else if (arrayList[position].catacory=="Quiz Reasoning"){
                 if (position==0){
                     val intent = Intent(context,Questions::class.java)
                     intent.putExtra("catagory",arrayList[position].catacory)
                     intent.putExtra("minidata", arrayList[0].topic)
                     context.startActivity(intent)
                 }
             }


            // this all data for go to question activity if user click Trick category
            if (arrayList[position].catacory=="Trick History"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
                else if (position==28){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[28].topic)
                    context.startActivity(intent)
                }
                else if (position==29){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[29].topic)
                    context.startActivity(intent)
                }
                else if (position==30){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[30].topic)
                    context.startActivity(intent)
                }
                else if (position==31){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[31].topic)
                    context.startActivity(intent)
                }
                else if (position==32){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[32].topic)
                    context.startActivity(intent)
                }


            }
            else if (arrayList[position].catacory=="Trick Geography"){
                if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }
                else if (position==28){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[28].topic)
                    context.startActivity(intent)
                }
                else if (position==29){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[29].topic)
                    context.startActivity(intent)
                }
                else if (position==30){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[30].topic)
                    context.startActivity(intent)
                }
                else if (position==31){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[31].topic)
                    context.startActivity(intent)
                }
                else if (position==32){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[32].topic)
                    context.startActivity(intent)
                }


            }
             else if (arrayList[position].catacory=="Trick Constitution"){
                 if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                 else if (position==26){
                     val intent = Intent(context, Questions::class.java)
                     intent.putExtra("catagory",arrayList[position].catacory)
                     intent.putExtra("minidata", arrayList[26].topic)
                     context.startActivity(intent)
                 }

             }
             else if (arrayList[position].catacory=="Trick Science"){
                 if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }
                else if (position==20){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[20].topic)
                    context.startActivity(intent)
                }
                else if (position==21){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[21].topic)
                    context.startActivity(intent)
                }
                else if (position==22){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[22].topic)
                    context.startActivity(intent)
                }
                else if (position==23){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[23].topic)
                    context.startActivity(intent)
                }
                else if (position==24){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[24].topic)
                    context.startActivity(intent)
                }
                else if (position==25){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[25].topic)
                    context.startActivity(intent)
                }
                else if (position==26){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[26].topic)
                    context.startActivity(intent)
                }
                else if (position==27){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[27].topic)
                    context.startActivity(intent)
                }

             }
             else if (arrayList[position].catacory=="Trick Economics"){
                 if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }

             }
             else if (arrayList[position].catacory=="Trick Computer"){
                  if (position==0){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[0].topic)
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[1].topic)
                    context.startActivity(intent)
                }
                else if (position==2){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[2].topic)
                    context.startActivity(intent)
                }
                else if (position==3){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[3].topic)
                    context.startActivity(intent)
                }
                else if (position==4){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[4].topic)
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[5].topic)
                    context.startActivity(intent)
                }
                else if (position==6){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[6].topic)
                    context.startActivity(intent)
                }
                else if (position==7){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[7].topic)
                    context.startActivity(intent)
                }
                else if (position==8){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[8].topic)
                    context.startActivity(intent)
                }
                else if (position==9){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[9].topic)
                    context.startActivity(intent)
                }
                else if (position==10){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[10].topic)
                    context.startActivity(intent)
                }
                else if (position==11){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[11].topic)
                    context.startActivity(intent)
                }
                else if (position==12){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[12].topic)
                    context.startActivity(intent)
                }
                else if (position==13){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[13].topic)
                    context.startActivity(intent)
                }
                else if (position==14){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[14].topic)
                    context.startActivity(intent)
                }
                else if (position==15){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[15].topic)
                    context.startActivity(intent)
                }
                else if (position==16){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[16].topic)
                    context.startActivity(intent)
                }
                else if (position==17){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[17].topic)
                    context.startActivity(intent)
                }
                else if (position==18){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[18].topic)
                    context.startActivity(intent)
                }
                else if (position==19){
                    val intent = Intent(context, Questions::class.java)
                    intent.putExtra("catagory",arrayList[position].catacory)
                    intent.putExtra("minidata", arrayList[19].topic)
                    context.startActivity(intent)
                }

             }
             else if (arrayList[position].catacory=="Trick Reasoning"){
                 if (position==0){
                     val intent = Intent(context,Questions::class.java)
                     intent.putExtra("catagory",arrayList[position].catacory)
                     intent.putExtra("minidata", arrayList[0].topic)
                     context.startActivity(intent)
                 }

             }
        }
    }
}