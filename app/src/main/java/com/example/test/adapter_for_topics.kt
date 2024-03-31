package com.example.test

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter_for_topics(val context: Context,val arrayList: ArrayList<Model_for_topics>):
    RecyclerView.Adapter<adapter_for_topics.mytopic>() {
    class mytopic(view: View):RecyclerView.ViewHolder(view) {

        val number=view.findViewById<TextView>(R.id.topicsnumber)
        val topics=view.findViewById<TextView>(R.id.topicstext)
        val topicsdesignLayout: ViewGroup = view.findViewById(R.id.topics_layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mytopic {
        return mytopic(LayoutInflater.from(context).inflate(R.layout.design_for_topics, null, false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: mytopic, position: Int) {

        holder.number.text=arrayList[position].number
        holder.topics.text=arrayList[position].topic

        holder.topicsdesignLayout.setOnClickListener {

            /* val Paragraphs="Paragraphs"
               val Oneline="Oneline"
               val Quiz="Quiz"
               val Trick="Trick"*/

            // this all data for go to question activity if user click Paragraphs category
            if (arrayList[position].catacory=="Paragraphs History"){
                if (position==0){
                    val intent = Intent(context,Questions::class.java)
                    intent.putExtra("minidata", "Paragraphs indian History")
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("minidata", "Paragraphs world History")
                    context.startActivity(intent)
                }
            }
            else if (arrayList[position].catacory=="Paragraphs Geography"){
                if (position==0){
                    val intent = Intent(context,topics::class.java)
                    intent.putExtra("minidata", "Paragraphs indian Geography")
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("minidata", "Paragraphs world Geography")
                    context.startActivity(intent)
                }
            }
            /*else if (arrayList[position].catacory=="Paragraphs Economics"){
                if (position==0){
                    val intent = Intent(context,topics::class.java)
                    intent.putExtra("minidata", "Paragraphs micro Economics")
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("minidata", "Paragraphs macro Economics")
                    context.startActivity(intent)
                }
            }*/


            // this all data for go to question activity if user click Oneline category
            if (arrayList[position].catacory=="Oneline History"){
                if (position==0){
                    val intent = Intent(context,topics::class.java)
                    intent.putExtra("minidata", "Oneline indian History")
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("minidata", "Oneline world History")
                    context.startActivity(intent)
                }
            }
            else if (arrayList[position].catacory=="Oneline Geography"){
                if (position==0){
                    val intent = Intent(context,topics::class.java)
                    intent.putExtra("minidata", "Oneline indian Geography")
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("minidata", "Oneline world Geography")
                    context.startActivity(intent)
                }
            }
            /*  else if (arrayList[position].catacory=="Oneline Economics"){
                  if (position==0){
                      val intent = Intent(context,Questions::class.java)
                      intent.putExtra("minidata", "Oneline micro Economics")
                      context.startActivity(intent)
                  }
                  else if (position==1){
                      val intent = Intent(context, Questions::class.java)
                      intent.putExtra("minidata", "Oneline macro Economics")
                      context.startActivity(intent)
                  }
              }*/


            // this all data for go to question activity if user click Quiz category
            if (arrayList[position].catacory=="Quiz History"){
                if (position==0){
                    val intent = Intent(context,topics::class.java)
                    intent.putExtra("minidata", "Quiz indian History")
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("minidata", "Quiz world History")
                    context.startActivity(intent)
                }
            }
            else if (arrayList[position].catacory=="Quiz Geography"){
                if (position==0){
                    val intent = Intent(context,topics::class.java)
                    intent.putExtra("minidata", "Quiz indian Geography")
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("minidata", "Quiz world Geography")
                    context.startActivity(intent)
                }
            }
            /* else if (arrayList[position].catacory=="Quiz Economics"){
                 if (position==0){
                     val intent = Intent(context,Questions::class.java)
                     intent.putExtra("minidata", "Quiz micro Economics")
                     context.startActivity(intent)
                 }
                 else if (position==1){
                     val intent = Intent(context, Questions::class.java)
                     intent.putExtra("minidata", "Quiz macro Economics")
                     context.startActivity(intent)
                 }
             }*/


            // this all data for go to question activity if user click Trick category
            if (arrayList[position].catacory=="Trick History"){
                if (position==0){
                    val intent = Intent(context,topics::class.java)
                    intent.putExtra("minidata", "Trick indian History")
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("minidata", "Trick world History")
                    context.startActivity(intent)
                }
            }
            else if (arrayList[position].catacory=="Trick Geography"){
                if (position==0){
                    val intent = Intent(context,topics::class.java)
                    intent.putExtra("minidata", "Trick indian Geography")
                    context.startActivity(intent)
                }
                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("minidata", "Trick world Geography")
                    context.startActivity(intent)
                }
            }
            /* else if (arrayList[position].catacory=="Trick Economics"){
                 if (position==0){
                     val intent = Intent(context,Questions::class.java)
                     intent.putExtra("minidata", "Trick micro Economics")
                     context.startActivity(intent)
                 }
                 else if (position==1){
                     val intent = Intent(context, Questions::class.java)
                     intent.putExtra("minidata", "Trick macro Economics")
                     context.startActivity(intent)
                 }
             }*/
        }
    }
}