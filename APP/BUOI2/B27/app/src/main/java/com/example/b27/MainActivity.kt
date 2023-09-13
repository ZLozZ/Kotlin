package com.example.b27

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnShow:Button
    private lateinit var btnAdd:Button
    lateinit var btnManage:Button
    lateinit var listMusic: ListView

    var stt:Int = 0

    private var adapterAlbum:MutableList<String> = mutableListOf()
    private lateinit var arrAlbum:MutableList<AlbumMusic>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addControls()
        addEventsBtn()
    }

    private fun addEventsBtn() {
        btnShow.setOnClickListener{
            val intent = Intent(this, AlbumActivity::class.java)
            val bundle = Bundle()
            bundle.putStringArrayList("arrMusic", ArrayList(arrAlbum))
            startActivity(intent)
        }

        btnAdd.setOnClickListener{
            addEventDialog(Gravity.CENTER)
        }
    }

    private fun addControls() {
        btnShow = findViewById(R.id.btnShow)
        btnAdd = findViewById(R.id.btnAddAlbum)

    }

    private fun addEventDialog(gravity: Int){
        var dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.custom_dialog)

         var window: Window? = dialog.window ?: return

        window?.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        var windowAttributes:WindowManager.LayoutParams = window!!.attributes
        windowAttributes.gravity = gravity
        if (window != null) {
            window.attributes = windowAttributes
        }

        if(gravity == Gravity.BOTTOM){
            dialog.setCancelable(true);
        }else{
            dialog.setCancelable(false);
        }

        val editDialogName:EditText = dialog.findViewById(R.id.editDialogName)
        val editDialogCode:EditText =  dialog.findViewById(R.id.editDialogCode)
        val btnDialogClear:Button = dialog.findViewById(R.id.btnDialogClear)
        val btnDialogSave:Button = dialog.findViewById(R.id.btnDialogSave)

        btnDialogClear.setOnClickListener{
           editDialogName.setText("")
           editDialogCode.setText("")
        }
        btnDialogSave.setOnClickListener{
            val name = editDialogName.text.toString()
            val code = editDialogCode.text.toString()
            stt += 1
            arrAlbum.add(AlbumMusic(stt,code,name))
        }
        dialog.show()
    }
}