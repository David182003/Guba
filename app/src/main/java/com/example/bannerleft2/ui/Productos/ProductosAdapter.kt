package com.example.bannerleft2.ui.Productos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductosAdapter(var list: List<Productos>):
    RecyclerView.Adapter<ProductosViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductosViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ProductosViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ProductosViewHolder, position: Int) {
        val favorito = list[position]
        holder.bind(favorito)
    }

    fun updateList(filteredList: List<Productos>) {

        // Update the adapter's internal data with the filtered list

    }



}