package com.example.pengendaracerdas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kelengkapan.*

class KelengkapanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelengkapan)

        btnPengendarasepeda.setOnClickListener { pengendarasepeda () }

        btnPengendaramotor.setOnClickListener { pengendaramotor () }

        btnPengendaramobil.setOnClickListener { pengendaramobil () }
    }

    private fun pengendarasepeda() {
        val intent = Intent(this, PengendarasepedaActivity::class.java)
        startActivity(intent)
    }
    private fun pengendaramotor() {
        val intent = Intent(this, PengendaramotorActivity::class.java)
        startActivity(intent)
    }
    private fun pengendaramobil() {
        val intent = Intent(this, PengendaramobilActivity::class.java)
        startActivity(intent)
    }
}
