package com.example.b27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class AlbumActivity : AppCompatActivity() {
    private lateinit var listMusic:ListView
    private var adapterMusic:ArrayList<AlbumMusic> = ArrayList()
    private var arrMusic:MutableList<AlbumMusic> = mutableListOf<AlbumMusic>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show)

        addControls()
        addEvents()
    }

    private fun addEvents(){
        val demoList = intent.getParcelableArrayListExtra<AlbumMusic>("arrMusic") as? MutableList<AlbumMusic>
        if (demoList != null) {
            arrMusic = demoList
        }
        Toast.makeText(this, "$arrMusic", Toast.LENGTH_SHORT).show()
        listMusic.adapter = CustomAdapter(this, arrMusic)
    }

    private fun addControls() {
        listMusic =findViewById(R.id.listMusic)
    }
}