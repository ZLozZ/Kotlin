package com.example.b27

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView

class CustomAdapter(var context: Context, private var album:ArrayList<AlbumMusic>): BaseAdapter(), ListAdapter{

    class ViewHolder(row:View){
        var txtStt: TextView
        var txtCode:TextView
        var txtName:TextView
        init{
            txtStt = row.findViewById(R.id.txtStt)
            txtCode = row.findViewById(R.id.txtCode)
            txtName = row.findViewById(R.id.txtName)
        }
    }
    override fun getCount(): Int {
        return album.size
    }

    override fun getItem(position: Int): Any {
        return album[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View {
        var view: View?
        var vHolder:ViewHolder
        if(convertview == null){
            var lFlater: LayoutInflater = LayoutInflater.from(context)
            view = lFlater.inflate(R.layout.item, null)
            vHolder = ViewHolder(view)
            view.tag = vHolder
        }else{
            view = convertview
            vHolder = convertview.tag as ViewHolder
        }
        var ds: AlbumMusic = getItem(position) as AlbumMusic
        vHolder.txtStt.text = ds.stt.toString()
        vHolder.txtCode.text = ds.code.toString()
        vHolder.txtName.text = ds.name
        return view as View
    }
}