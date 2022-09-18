package com.elearningcourse.e_learningapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.elearningcourse.e_learningapp.data.model.Planet
import com.elearningcourse.e_learningapp.databinding.ThirdUnitMaterialItemBinding

class ScreenSlideAdapter :
    ListAdapter<Planet, ScreenSlideAdapter.CustomViewHolder>(PlanetDiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val thirdUnitMaterialItemBinding =
            ThirdUnitMaterialItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(thirdUnitMaterialItemBinding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val planet = getItem(position)
        holder.bind(planet)
    }

    class CustomViewHolder(private val thirdUnitMaterialItemBinding: ThirdUnitMaterialItemBinding) :
        RecyclerView.ViewHolder(thirdUnitMaterialItemBinding.root) {

        fun bind(dataItem: Planet) {
            thirdUnitMaterialItemBinding.textViewDescriptionPlaceholder.text = dataItem.description
            dataItem.planetImage?.let {
                thirdUnitMaterialItemBinding.imageViewPlaceholder.setImageResource(
                    it
                )
            }
        }

    }

}

object PlanetDiffCallBack : DiffUtil.ItemCallback<Planet>() {
    override fun areItemsTheSame(oldItem: Planet, newItem: Planet): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Planet, newItem: Planet): Boolean {
        return oldItem.id == newItem.id
    }

}
