package com.own_world.undastadingrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(var dataList: ArrayList<DataModel>, var context: Context):RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.rv_view_structure,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount() =dataList.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       /* TODO("Not yet implemented") */
    }
}