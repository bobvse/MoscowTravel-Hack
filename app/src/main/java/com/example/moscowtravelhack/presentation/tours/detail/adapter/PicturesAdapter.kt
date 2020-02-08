package com.example.moscowtravelhack.presentation.tours.detail.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.BaseItemsAdapter
import com.example.moscowtravelhack.model.PicturesData
import kotlinx.android.synthetic.main.pictures_list_item.view.*

class PicturesAdapter(
    items: MutableList<PicturesData> = mutableListOf(),
    private val onItemClicked: (data: PicturesData) -> Unit
) : BaseItemsAdapter<PicturesData, PicturesAdapter.PopularDirectionViewHolder>(items) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularDirectionViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.pictures_list_item, parent, false)
        return PopularDirectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopularDirectionViewHolder, position: Int) {
        holder.bind(items[position], onItemClicked)
    }

    override fun getItemCount() = items.size

    class PopularDirectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(pictureData: PicturesData, onItemClicked: (data: PicturesData) -> Unit) {
            //  itemView.tvRoutePoints.text = popularDirectionData.primaryTitle
            //   itemView.tvTripDays.text = popularDirectionData.secondaryTitle
            Glide.with(itemView).load(pictureData.url).placeholder(R.drawable.ic_see).into(itemView.image_see)

            //itemView.setOnClickListener { onItemClicked(pictureData.data) }
        }
    }

    override fun getDiffCallback(
        oldItems: List<PicturesData>,
        newItems: List<PicturesData>
    ): DiffUtil.Callback {
        return object : DiffUtil.Callback() {
            override fun getOldListSize() = oldItems.size

            override fun getNewListSize() = newItems.size

            override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                return true
            }

            override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                return oldItems[oldItemPosition] == newItems[newItemPosition]
                        && oldItems[oldItemPosition] == newItems[newItemPosition]
                        && oldItems[oldItemPosition] == newItems[newItemPosition]
            }

        }
    }

}