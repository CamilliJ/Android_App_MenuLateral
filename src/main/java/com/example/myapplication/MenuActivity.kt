package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuActivity : AppCompatActivity() {

    var mDrawerLayout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        initDrawerMenu()
    }

    private fun initDrawerMenu() {
        mDrawerLayout = findViewById(R.id.drawerLayout)

        var btnMenu = findViewById<Button>(R.id.btnMenu)
        btnMenu?.setOnClickListener{
            mDrawerLayout!!.openDrawer(GravityCompat.START)
        }

        val MyRecyclerAdapter = DrawerAdapter(this)

        var rvDrawerMenu = findViewById<RecyclerView>(R.id.rvDrawerMenu)
        rvDrawerMenu.layoutManager = LinearLayoutManager(this)
        rvDrawerMenu.adapter = MyRecyclerAdapter

    }

}