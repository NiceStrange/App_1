package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.ItemAdapter
import com.example.myapplication.bean.ItemBean

class FirstFragement:Fragment() {
    var arr=ArrayList<ItemBean>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //把xml转换成一个view
        var view=inflater.inflate(R.layout.first_fragment,container,false)
        initdata()
        var recyclerView=view.findViewById<RecyclerView>(R.id.recycleview)
        var adapter=ItemAdapter()
        recyclerView.adapter=adapter
        adapter.data=arr
        arr.forEach {
            Log.d("3213",it.desc)
        }
        return view
    }
    fun initdata(){
        for (i in 0..10) {
            var icon:Int?=null
            when(i%3){
                0->icon=R.drawable.ic_dashboard_black_24dp
                1->icon=R.drawable.ic_home_black_24dp
                2->icon=R.drawable.ic_notifications_black_24dp
            }
            icon?.let {
                arr.add(ItemBean("第${i+1}个标题","第${i+1}个内容",icon))

            }
        }
    }
    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

}