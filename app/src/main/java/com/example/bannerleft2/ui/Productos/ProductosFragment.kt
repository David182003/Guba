package com.example.bannerleft2.ui.Productos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bannerleft2.R

class ProductosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rv_Productos = view.findViewById<RecyclerView>(R.id.rv_productos)

        //Creamos la lista de datps
        val listProductos = listOf<Productos>(
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),
            Productos(R.drawable.w_800_h_800_fit_pad, "Tablero Pino FJ", "18x300x2440mm", 5000.0),


            )

        val adapter = ProductosAdapter(listProductos)

        rv_Productos.adapter = adapter
        rv_Productos.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    companion object{
        fun newInstance() : ProductosFragment = ProductosFragment()
    }

}