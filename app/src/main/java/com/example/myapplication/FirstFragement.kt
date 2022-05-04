package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*

class FirstFragement:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //把xml转换成一个view
        var view=inflater.inflate(R.layout.first_fragment,container,false)

        var  textView=view.findViewById<TextView>(R.id.textView)
        GlobalScope.launch {

        }
//        lifecycleScope.launch {
//            var i=0
//            while (true){
//                withContext(Dispatchers.Main){
//                    textView.setText("WWWW"+i)
//                }
//                i++
//                delay(500)
//            }
//        }
        return view
    }
    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

}