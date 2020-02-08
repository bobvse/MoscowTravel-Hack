package com.example.moscowtravelhack.presentation.tours.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.BaseItemsAdapter

class ToursListAdapter(
    cities: MutableList<TourModel> = mutableListOf(),
    private val onCityClicked: (item: TourModel) -> Unit
) : BaseItemsAdapter<TourModel, ToursListAdapter.CityViewHolder>(cities) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        return CityViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.tour_list_item, parent,false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val city = items[position]
        holder.bind(city, onCityClicked)
    }

    class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(city: TourModel, onCityClicked: (item: TourModel) -> Unit) {
//            itemView.tvSearchCityListItemName.text = city.cityName
//            itemView.tvSearchCountryListItemName.text = city.countryName
//
//            itemView.mainCityContainer.setOnClickListener { onCityClicked(city) }
        }
    }

    override fun getDiffCallback(
        oldItems: List<TourModel>,
        newItems: List<TourModel>
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