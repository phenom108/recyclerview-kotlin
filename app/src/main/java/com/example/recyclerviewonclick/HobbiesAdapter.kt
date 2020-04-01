package com.example.recyclerviewonclick

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(private val context: Context, private val hobbiesList: List<Model>) :
    RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbiesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby: Model = hobbiesList[position]
        holder.hobbyTextView.text = hobby.hobbyName
        holder.itemView.setOnClickListener{
            Toast.makeText(context,""+hobby.hobbyName,Toast.LENGTH_SHORT).show()
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hobbyTextView: TextView = itemView.findViewById(R.id.hobby_text_view)
    }

}