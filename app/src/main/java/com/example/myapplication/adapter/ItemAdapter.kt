package com.example.myapplication.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.myapplication.R
import com.example.myapplication.bean.ItemBean

class ItemAdapter:BaseQuickAdapter<ItemBean,BaseViewHolder>(R.layout.item_1){
    override fun convert(holder: BaseViewHolder, item: ItemBean) {
        holder.setText(R.id.item_title,item.title)
        holder.setText(R.id.item_message,item.desc)
        holder.setImageResource(R.id.item_image,item.icon)
    }
}