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
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: RvAdapter
    private lateinit var dataList: ArrayList<DataModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        dataList = ArrayList<DataModel>()

        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))
        dataList.add(DataModel(R.drawable.pizza,"Pizza Inn","5 Pices"))

        rvAdapter = RvAdapter(dataList,this@MainActivity)
        binding.rv.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.rv.adapter = rvAdapter
    }
}