package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DrawerAdapter(private val context: Context) : RecyclerView.Adapter<DrawerAdapter.ViewHolder>() {

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        lateinit var view: View
        if (viewType == 0)
            view = LayoutInflater.from(parent.context).inflate(R.layout.menu_usuario, parent,false)
        else
            view = LayoutInflater.from(parent.context).inflate(R.layout.menu_usuario, parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when (position){
            1 -> {
                val tvOption = holder.itemView.findViewById<TextView>(R.id.text1)
                tvOption?.text = "ListView"

                holder.itemView.setOnClickListener{
                    Toast.makeText(context, "ListView", Toast.LENGTH_SHORT).show()
                }
            }
            2 -> {
                val tvOption = holder.itemView.findViewById<TextView>(R.id.text1)
                tvOption?.text = "RecyclerView"

                holder.itemView.setOnClickListener{
                    Toast.makeText(context, "ListView", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}
