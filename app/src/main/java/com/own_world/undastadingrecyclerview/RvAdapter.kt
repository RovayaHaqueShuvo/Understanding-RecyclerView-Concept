package com.own_world.undastadingrecyclerview

import android.app.Activity
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.own_world.undastadingrecyclerview.databinding.RvViewStructureBinding
import com.shashank.sony.fancytoastlib.FancyToast
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle


//Inatializing RecyclerView Element and Adapter
class RvAdapter(var dataList: ArrayList<DataModel>, var context: Context):RecyclerView.Adapter<RvAdapter.ViewHolder>() {

//Call Xml Layout File and Return ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //var view = LayoutInflater.from(context).inflate(R.layout.rv_view_structure,parent,false)
       // return ViewHolder(view)
        var binding = RvViewStructureBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

//Count Item Infinity accroding to DataModel Class
    override fun getItemCount() =dataList.size


//Changing Xml file Data according to datalist = DataModel Class
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.pizzaicon.setImageResource(dataList.get(position).profile)
        holder.binding.name.text = dataList.get(position).name
        holder.binding.available.text = dataList.get(position).address
    holder.itemView.setOnClickListener {
        //Toast.makeText(context, "Click Listen", Toast.LENGTH_LONG).show()

        MotionToast.darkColorToast(
            context as Activity,
            "On Clicked 😍",
            "MotionToast Work successfully!",
            MotionToastStyle.SUCCESS,
            MotionToast.GRAVITY_BOTTOM,
            MotionToast.SHORT_DURATION,
            ResourcesCompat.getFont(context, www.sanju.motiontoast.R.font.helvetica_regular))

    }
    }

//Inatializing ViewHolder
    inner class ViewHolder(var binding: RvViewStructureBinding):RecyclerView.ViewHolder(binding.root){

    }
}