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
import com.example.test.activity.topics
import com.example.test.modelclass.ModelClass

class adapterclass(val context: Context,val arrayList: ArrayList<ModelClass>):RecyclerView.Adapter<adapterclass.mydata>() {
    class mydata(view: View):RecyclerView.ViewHolder(view) {

        val image=view.findViewById<ImageView>(R.id.catimage)
        val text=view.findViewById<TextView>(R.id.cattext)
        val designLayout: ViewGroup = view.findViewById(R.id.design)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mydata {
        return mydata(LayoutInflater.from(context).inflate(R.layout.design,null,false))
    }

    override fun onBindViewHolder(holder: mydata, position: Int) {

        holder.image.setImageResource(arrayList[position].image)
        holder.text.text=arrayList[position].text

        holder.designLayout.setOnClickListener{

            if (arrayList[position].homecatacory=="Paragraphs"){
                if (position==0){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Paragraphs History")
                    context.startActivity(intent)
                }

                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Paragraphs Geography")
                    context.startActivity(intent)
                }

                else if (position==2){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Paragraphs Constitution")
                    context.startActivity(intent)
                }

                else if (position==3){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Paragraphs Science")
                    context.startActivity(intent)
                }

                else if (position==4){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Paragraphs Economics")
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Paragraphs Computer")
                    context.startActivity(intent)
                }

                else if (position==6){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Paragraphs Reasoning")
                    context.startActivity(intent)
                }

            }

            else if (arrayList[position].homecatacory=="Oneline"){
                if (position==0){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Oneline History")
                    context.startActivity(intent)
                }

                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Oneline Geography")
                    context.startActivity(intent)
                }

                else if (position==2){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Oneline Constitution")
                    context.startActivity(intent)
                }

                else if (position==3){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Oneline Science")
                    context.startActivity(intent)
                }

                else if (position==4){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Oneline Economics")
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Oneline Computer")
                    context.startActivity(intent)
                }

                else if (position==6){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Oneline Reasoning")
                    context.startActivity(intent)
                }

            }

            else if (arrayList[position].homecatacory=="Quiz"){
                if (position==0){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Quiz History")
                    context.startActivity(intent)
                }

                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Quiz Geography")
                    context.startActivity(intent)
                }

                else if (position==2){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Quiz Constitution")
                    context.startActivity(intent)
                }

                else if (position==3){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Quiz Science")
                    context.startActivity(intent)
                }

                else if (position==4){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Quiz Economics")
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Quiz Computer")
                    context.startActivity(intent)
                }

                else if (position==6){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Quiz Reasoning")
                    context.startActivity(intent)
                }

            }

            else if (arrayList[position].homecatacory=="Trick"){
                if (position==0){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Trick History")
                    context.startActivity(intent)
                }

                else if (position==1){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Trick Geography")
                    context.startActivity(intent)
                }

                else if (position==2){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Trick Constitution")
                    context.startActivity(intent)
                }

                else if (position==3){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Trick Science")
                    context.startActivity(intent)
                }

                else if (position==4){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Trick Economics")
                    context.startActivity(intent)
                }
                else if (position==5){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Trick Computer")
                    context.startActivity(intent)
                }

                else if (position==6){
                    val intent = Intent(context, topics::class.java)
                    intent.putExtra("data", "Trick Reasoning")
                    context.startActivity(intent)
                }

            }


        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}