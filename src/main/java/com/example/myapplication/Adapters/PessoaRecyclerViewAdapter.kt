package com.example.myapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Classes.Pessoa
import com.example.myapplication.R

class PessoaRecyclerViewAdapter(val context: Context, val list: ArrayList<Pessoa>, val click: (pessoa: Pessoa) -> Unit) :
 RecyclerView.Adapter<PessoaRecyclerViewAdapter.ViewHolder>() {

     class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
         val tvNome = view.findViewById<TextView>(R.id.tvNome)
         val tvIdade = view.findViewById<TextView>(R.id.tvIdade)
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNome.text = list[position].nome
        holder.tvIdade.text = "Idade: " + list[position].idade
        holder.itemView.setOnClickListener {
            click(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}