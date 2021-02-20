package com.kidasu.uts201804014

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val t_user: TextView = findViewById(R.id.tampil_user)

        val bundle = intent.extras
        t_user.setText(bundle?.getString("user"))

        val gunpla: Button = findViewById(R.id.btn_gunpla)
        gunpla.setOnClickListener{
            val intent = Intent(this, GunplaActivity::class.java)
            startActivity(intent)
        }

        val tools: Button = findViewById(R.id.btn_tools)
        tools.setOnClickListener{
            val intent = Intent(this, ToolsActivity::class.java)
            startActivity(intent)
        }

        val about: Button = findViewById(R.id.btn_about)
        about.setOnClickListener{
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}