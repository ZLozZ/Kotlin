package com.example.b27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class AlbumActivity : AppCompatActivity() {
    private lateinit var listMusic:ListView
    private var adapterMusic:ArrayList<AlbumMusic> = ArrayList()
    private lateinit var arrMusic:MutableList<AlbumMusic>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show)

        addControls()
        addEvents()
    }

    private fun addEvents(){

    }

    private fun addControls() {
        listMusic =findViewById(R.id.listMusic)

        arrMusic.add(AlbumMusic(1,"album1", "Nhac viet"))
        arrMusic.add(AlbumMusic(2,"album2", "Nhac My"))
        listMusic.adapter = CustomAdapter(this, arrMusic)
    }
}