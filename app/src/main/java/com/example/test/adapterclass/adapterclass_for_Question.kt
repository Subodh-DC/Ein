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
import com.example.test.interfac.RecyclerViewClick
import com.example.test.modelclass.Modelclass_for_Qustion

class adapterclass_for_Question(val context: Context, val arrayList: ArrayList<Modelclass_for_Qustion>,private val listener: RecyclerViewClick):
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

            listener.onIntemClicked(position)


        }
    }
}