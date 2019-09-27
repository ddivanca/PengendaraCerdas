package com.example.pengendaracerdas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRambu.setOnClickListener { rambu () }

        btnKelengkapan.setOnClickListener { kelengkapan () }

        btnTipsberkendarayangbaik.setOnClickListener { tipsberkendarayangbaik () }

        btnAbout.setOnClickListener { about () }

    }


    private fun rambu() {
        val intent = Intent(this, RambuActivity::class.java)
        startActivity(intent)
    }
    private fun kelengkapan() {
        val intent = Intent(this, KelengkapanActivity::class.java)
        startActivity(intent)
    }
    private fun tipsberkendarayangbaik() {
        val intent = Intent(this, TipsberkendarayangbaikActivity::class.java)
        startActivity(intent)
    }
    private fun about() {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}
