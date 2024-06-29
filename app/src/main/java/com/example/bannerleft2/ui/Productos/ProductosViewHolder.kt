package com.example.bannerleft2.ui.Productos

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bannerleft2.R

class ProductosViewHolder(inflater: LayoutInflater, viewGroup: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.it_productos,viewGroup, false)) {

    private var imagenProducto: ImageView? = null
    private var nombre : TextView? = null
    private var descripcion : TextView? = null
    private var precio : TextView? = null

    init {
        imagenProducto = itemView.findViewById(R.id.imgProducto)
        nombre = itemView.findViewById(R.id.textNombreProducto)
        descripcion = itemView.findViewById(R.id.textDescripcion)
        precio = itemView.findViewById(R.id.textPrecio)
    }

    fun bind(favorito: Productos){
        imagenProducto?.setImageResource(favorito.imagenProducto)
        nombre?.text = (favorito.nombre)
        descripcion?.text = (favorito.descripcion)
        precio?.text = (favorito.precio).toString()
    }
}