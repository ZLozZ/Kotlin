package com.example.b2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import java.io.File


class MainActivity : AppCompatActivity() {
    private lateinit var lstFile:ListView
    private lateinit var btnDelAll:Button
    private lateinit var btnDel:Button

    private lateinit var listAdapter: ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addControls()
        addEvents()
    }

    private fun addEvents() {
        btnDel.setOnClickListener{
        }
    }

    private fun addControls() {
        lstFile = findViewById(R.id.listFile)
        btnDel = findViewById(R.id.btnDl)
        btnDelAll = findViewById(R.id.btnDlAll)

        val cacheDir = this.cacheDir
        val cacheFiles = cacheDir.listFiles().toList()

        var arrFile: MutableList<String> = mutableListOf()

        for (file in cacheFiles) {
            arrFile.add(file.name)
        }
        listAdapter=ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, arrFile)
        lstFile.adapter = listAdapter
    }

}