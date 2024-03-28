package com.example.test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter_for_answer(val context: Context,val arrayList: ArrayList<Modelclass_for_answer>):RecyclerView.Adapter<adapter_for_answer.data>() {
    class data(view: View):RecyclerView.ViewHolder(view) {

        val image=view.findViewById<ImageView>(R.id.paragraph_answer_image)
        val questionpara=view.findViewById<TextView>(R.id.paragraph_answer_text1)
        val answerpara=view.findViewById<TextView>(R.id.paragraph_answer_text2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): data {
        return data(LayoutInflater.from(context).inflate(R.layout.design_for_paragraph_answer, null, false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: data, position: Int) {
        holder.image.setImageResource(arrayList[position].image)
        holder.questionpara.text=arrayList[position].question
        holder.answerpara.text=arrayList[position].answer
    }
}