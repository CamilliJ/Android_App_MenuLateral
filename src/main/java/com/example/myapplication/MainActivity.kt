package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Adapters.PessoaAdapter
import com.example.myapplication.Adapters.PessoaRecyclerViewAdapter
import com.example.myapplication.Classes.Pessoa

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val listView = findViewById<ListView>(R.id.listView)

        val lista = ArrayList<Pessoa>()
        for (i in 0..99) {
            val pessoa = Pessoa("Nome pessoa $i", "${i+5}")
            lista.add(pessoa)
        }

//        val adapter = PessoaAdapter(this, lista)
//        listView.adapter = adapter
//
//        listView.setOnItemClickListener { adapterView, view, i, l ->
//            Toast.makeText(this, "Nome: ${lista[i].nome} | Idade: ${lista[i].idade}", Toast.LENGTH_LONG).show()
//        }



        // RecyclerView

        val recycler = findViewById<RecyclerView>(R.id.recycler)

        val adapter = PessoaRecyclerViewAdapter(this, lista, fun (pessoa: Pessoa) {
            Toast.makeText(this, "Nome: ${pessoa.nome} | Idade: ${pessoa.idade}", Toast.LENGTH_LONG).show()
        })

        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler.itemAnimator = DefaultItemAnimator()
    }
}