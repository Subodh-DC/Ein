package com.example.test.adapterclass

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.activity.answer
import com.example.test.activity.oneline_answer
import com.example.test.activity.quiz_answer
import com.example.test.modelclass.Modelclass_for_Qustion

class adapterclass_for_Question(val context: Context, val arrayList: ArrayList<Modelclass_for_Qustion>):
    RecyclerView.Adapter<adapterclass_for_Question.data>() {
    class data(view: View):RecyclerView.ViewHolder(view) {

        val text1=view.findViewById<TextView>(R.id.questiontext)
        val designLayout: ViewGroup = view.findViewById(R.id.design_layout_question)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): data {
        return data(LayoutInflater.from(context).inflate(R.layout.design_question,null,false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: data, position: Int) {
        holder.text1.text=arrayList[position].question


        holder.designLayout.setOnClickListener {

            //below  paragraph question
            //Indian History
            if (arrayList[position].minidata == "Paragraphs indian History1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }
            else if (arrayList[position].minidata == "Paragraphs indian History2") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }
            else if (arrayList[position].minidata == "Paragraphs indian History3") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //World History
            else if (arrayList[position].minidata == "Paragraphs world History1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //indian Geography
            else if (arrayList[position].minidata == "Paragraphs indian Geography1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //World Geography
            else if (arrayList[position].minidata == "Paragraphs world Geography1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //micro Economics
            else if (arrayList[position].minidata == "Paragraphs micro Economics1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //macro Economics
            else if (arrayList[position].minidata == "Paragraphs macro Economics1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }


            //below is Online question
            //indian History
            else if (arrayList[position].minidata == "Oneline indian History1") {
                val intent = Intent(context, oneline_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //world History
            else if (arrayList[position].minidata == "Oneline world History1") {
                val intent = Intent(context, oneline_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //indian Geography
            else if (arrayList[position].minidata == "Oneline indian Geography1") {
                val intent = Intent(context, oneline_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //world Geography
            else if (arrayList[position].minidata == "Oneline world Geography1") {
                val intent = Intent(context, oneline_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //micro Economics
            else if (arrayList[position].minidata == "Oneline micro Economics1") {
                val intent = Intent(context, oneline_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //macro Economics
            else if (arrayList[position].minidata == "Oneline macro Economics1") {
                val intent = Intent(context, oneline_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }


            //below is Quiz question
            //indian History
            else if (arrayList[position].minidata == "Quiz indian History1") {
                val intent = Intent(context, quiz_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //world History
            else if (arrayList[position].minidata == "Quiz world History1") {
                val intent = Intent(context, quiz_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //indian Geography
            else if (arrayList[position].minidata == "Quiz indian Geography1") {
                val intent = Intent(context, quiz_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //world Geography
            else if (arrayList[position].minidata == "Quiz world Geography1") {
                val intent = Intent(context, quiz_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //micro Economics
            else if (arrayList[position].minidata == "Quiz micro Economics1") {
                val intent = Intent(context, quiz_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //macro Economics
            else if (arrayList[position].minidata == "Quiz macro Economics1") {
                val intent = Intent(context, quiz_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            else if (arrayList[position].minidata == "Quiz Reasoning1") {
                val intent = Intent(context, quiz_answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }


            //below 6 is Trick question
            //indian History
            else if (arrayList[position].minidata == "Trick indian History1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //world History
            else if (arrayList[position].minidata == "Trick world History1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //indian Geography
            else if (arrayList[position].minidata == "Trick indian Geography1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //world Geography
            else if (arrayList[position].minidata == "Trick world Geography1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //micro Economics
            else if (arrayList[position].minidata == "Trick micro Economics1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

            //macro Economics
            else if (arrayList[position].minidata == "Trick macro Economics1") {
                val intent = Intent(context, answer::class.java)
                intent.putExtra("question", arrayList[position].question)
                context.startActivity(intent)
            }

        }
    }
}