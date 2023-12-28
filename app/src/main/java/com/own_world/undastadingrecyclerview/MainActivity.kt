package com.own_world.undastadingrecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.own_world.undastadingrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Active binding mode
    private lateinit var binding: ActivityMainBinding

    //RecyclerView
    private lateinit var rvAdapter: RvAdapter

    //Data List
    private lateinit var dataList: ArrayList<DataModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        dataList = ArrayList<DataModel>()
//      Customize  dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))
        dataList.add(DataModel(R.drawable.pizza, "Pizza Inn", "5 Pices"))

        //passing Context and dataList to RvAdapter
        rvAdapter = RvAdapter(dataList, this@MainActivity)

        //Setting style Type
        binding.rv.layoutManager = LinearLayoutManager(this@MainActivity)

        //Connect Xml File with Adapter
        binding.rv.adapter = rvAdapter
    }
}