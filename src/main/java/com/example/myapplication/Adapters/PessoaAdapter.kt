package com.example.myapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.myapplication.Classes.Pessoa
import com.example.myapplication.R

class PessoaAdapter(val context: Context, val list: ArrayList<Pessoa>): BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, p2, false)
        val tvNome = view.findViewById<TextView>(R.id.tvNome)
        val tvIdade = view.findViewById<TextView>(R.id.tvIdade)

        val pessoa = list[p0]
        tvNome.text = pessoa.nome
        tvIdade.text = "Idade: ${pessoa.idade}"

        return view
    }
}