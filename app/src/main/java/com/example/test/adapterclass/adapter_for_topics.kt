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
import com.example.test.interfac.RecyclerViewClick
import com.example.test.modelclass.Model_for_topics

class adapter_for_topics(val context: Context,val arrayList: ArrayList<Model_for_topics>,private val listener: RecyclerViewClick):
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

            listener.onIntemClicked(position)

        }
    }
}