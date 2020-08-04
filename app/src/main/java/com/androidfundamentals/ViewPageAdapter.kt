package com.androidfundamentals

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ViewPageAdapter(val images:List<Int>) : RecyclerView.Adapter<ViewPageAdapter.ViewPageViewHolder>() {

    inner class ViewPageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPageViewHolder {
        //se infla una vista con los item view pager
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager,parent,false)
        
        //luego retornamos esa lista
        return ViewPageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ViewPageViewHolder, position: Int) {
        val curImage = images[position]
        holder.itemView.ivImage.setImageResource(curImage)

    }
}