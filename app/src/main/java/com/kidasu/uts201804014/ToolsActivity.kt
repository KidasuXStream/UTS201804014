package com.kidasu.uts201804014

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class ToolsActivity : AppCompatActivity() {
    private  lateinit var rvTools: RecyclerView
    private var list: ArrayList<Tools> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tools)

        rvTools = findViewById(R.id.rv_tools)
        rvTools.setHasFixedSize(true)

        list.addAll(DataTools.listData)
        showRecyclerViewCardMode()
    }
    private fun showRecyclerViewCardMode(){
        rvTools.layoutManager = LinearLayoutManager(this)
        val cardToolsAdapter = CardToolsAdapter(list)
        rvTools.adapter = cardToolsAdapter
    }
}