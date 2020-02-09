package com.example.moscowtravelhack.presentation.tours.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.BaseItemsAdapter
import com.example.moscowtravelhack.model.ToursListResponse
import kotlinx.android.synthetic.main.tour_list_item.view.*

class ToursListAdapter(
    tours: MutableList<ToursListResponse> = mutableListOf(),
    private val onItemClicked: (item: ToursListResponse) -> Unit
) : BaseItemsAdapter<ToursListResponse, ToursListAdapter.ToursViewHolder>(tours) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToursViewHolder {
        return ToursViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.tour_list_item, parent, false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ToursViewHolder, position: Int) {
        val tour = items[position]
        holder.bind(tour, onItemClicked)
    }

    class ToursViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(tour: ToursListResponse, onItemClicked: (item: ToursListResponse) -> Unit) {

            Glide.with(itemView.context)
                .load(R.drawable.palacefull)
                .centerCrop()
                .into(itemView.imageView)

            itemView.itemContainer.setOnClickListener { onItemClicked(tour) }
        }
    }

    override fun getDiffCallback(
        oldItems: List<ToursListResponse>, newItems: List<ToursListResponse>
    ): DiffUtil.Callback {
        return object : DiffUtil.Callback() {
            override fun getOldListSize() = oldItems.size

            override fun getNewListSize() = newItems.size

            override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                return oldItems[oldItemPosition] == newItems[newItemPosition]
            }

            override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                return oldItems[oldItemPosition] == newItems[newItemPosition]
            }
        }
    }
}