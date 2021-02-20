package com.kidasu.uts201804014

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val kontak: TextView = findViewById(R.id.tv_kontak)
        val btn_kontak: Button = findViewById(R.id.btn_kontak)

        btn_kontak.setOnClickListener {
            val panggil_nomor = kontak.text.toString()
            val Dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$panggil_nomor"))
            startActivity(Dial)
        }
    }
}