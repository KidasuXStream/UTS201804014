package com.kidasu.uts201804014

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class GunplaActivity : AppCompatActivity() {
    private  lateinit var rvGunpla: RecyclerView
    private var list: ArrayList<Gunpla> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gunpla)

        rvGunpla = findViewById(R.id.rv_gunpla)
        rvGunpla.setHasFixedSize(true)

        list.addAll(DataGunpla.listData)
        showRecyclerViewCardMode()
    }

    private fun showRecyclerViewCardMode(){
        rvGunpla.layoutManager = LinearLayoutManager(this)
        val cardGunplaAdapter = CardGunplaAdapter(list)
        rvGunpla.adapter = cardGunplaAdapter
    }
}