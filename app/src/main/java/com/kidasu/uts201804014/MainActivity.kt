package com.kidasu.uts201804014

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit_user: EditText = findViewById(R.id.edit_user)
        val btn_login: Button = findViewById(R.id.btn_login)
        val btn_exit: Button = findViewById(R.id.btn_exit)

        btn_login.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("user",edit_user.text.toString())
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        btn_exit.setOnClickListener {
            System.exit(0)
        }
    }
}