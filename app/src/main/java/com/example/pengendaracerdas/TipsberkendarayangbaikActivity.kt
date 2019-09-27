package com.example.pengendaracerdas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tipsberkendarayangbaik.*

class TipsberkendarayangbaikActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipsberkendarayangbaik)

        btnTipspengendarasepeda.setOnClickListener { tipspengendarasepeda () }

        btnTipsengendaramotor.setOnClickListener { tipspengendaramotor () }

        btnTipspengendaramobil.setOnClickListener { tipspengendaramobil () }

    }

    private fun tipspengendarasepeda() {
        val intent = Intent(this, TipspengendarasepedaActivity::class.java)
        startActivity(intent)
    }
    private fun tipspengendaramotor() {
        val intent = Intent(this, TipspengendaramotorActivity::class.java)
        startActivity(intent)
    }
    private fun tipspengendaramobil() {
        val intent = Intent(this, TipspengendaramobilActivity::class.java)
        startActivity(intent)
    }
}
