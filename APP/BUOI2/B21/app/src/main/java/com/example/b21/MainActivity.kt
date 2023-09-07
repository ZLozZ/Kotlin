package com.example.b21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ListView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    val arrSp = arrayOf("Điện thoai", "Máy Tính", "Đồng hồ")
    lateinit var spnSp: Spinner
    lateinit var lSp: ListView
    lateinit var autoText: AutoCompleteTextView
    lateinit var spninerAdapter: ArrayAdapter<String>
    var lookText = mutableListOf<String>("Iphone", "Nokia", "LG")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AddControls()
    }

    fun AddControls(){
        spnSp = findViewById(R.id.spinner)
        spninerAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrSp)
        spninerAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice)
        spnSp.adapter = spninerAdapter

        autoText = findViewById(R.id.autoText)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lookText)
        autoText.setAdapter(adapter)
    }
}