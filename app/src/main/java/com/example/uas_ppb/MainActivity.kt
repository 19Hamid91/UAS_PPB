package com.example.uas_ppb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var actionBar = getSupportActionBar()

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }

    fun makanan(view: android.view.View) {
        val intent = Intent(this@MainActivity, Makanan_MinumanActivity::class.java)
        startActivity(intent)
    }
    fun rumah(view: android.view.View) {
        val intent = Intent(this@MainActivity, Rumah_DapurActivity::class.java)
        startActivity(intent)
    }
    fun bayi(view: android.view.View) {
        val intent = Intent(this@MainActivity, Ibu_AnakActivity::class.java)
        startActivity(intent)
    }
    fun kesehatan(view: android.view.View) {
        val intent = Intent(this@MainActivity, Kesehatan_KecantikanActivity::class.java)
        startActivity(intent)
    }
}