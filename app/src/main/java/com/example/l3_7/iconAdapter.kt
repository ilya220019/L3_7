package com.example.l3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.l3_7.databinding.ItemIconBinding
import kotlin.reflect.KFunction1

class iconAdapter(
    val list: ArrayList<iconModel>,
    val onClick: (position: iconModel) -> Unit
): Adapter<iconAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemIconBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun getItemCount() = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    inner class ViewHolder(private val binding: ItemIconBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            val item = list[adapterPosition]
            binding.tv1Item.text = item.name
            binding.tv2Item.text = item.username
            binding.tv3Item.text = item.number
            Glide.with(binding.imgItem).load(item.img).into(binding.imgItem)
        itemView.setOnClickListener {
            onClick(item)
        }
        }
    }
}