package com.example.bannerleft2.ui.Productos

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bannerleft2.R

class ProductosFragment : Fragment() {


    private lateinit var adapter: ProductosAdapter
    private var filteredList = listOf<Productos>() // Lista filtrada

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
        val searchEditText = view.findViewById<EditText>(R.id.search_edit_text) // Referencia al EditText
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



        val adapter = ProductosAdapter(listProductos) // Initialize here
        filteredList = listProductos // Inicializar lista filtrada con la original




        rv_Productos.adapter = adapter
        rv_Productos.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, before: Int) { }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }
            override fun afterTextChanged(p0: Editable?) {

            }

            // Implement the required function
             fun afterTextChanged(s: CharSequence?) {
                val query = s.toString().lowercase() // Your filtering logic here
                filteredList = listProductos.filter { product ->
                    product.nombre.lowercase().contains(query)
                }


                adapter.updateList(filteredList) // Update the adapter with filtered data
            }
        })
    }

    companion object{
        fun newInstance() : ProductosFragment = ProductosFragment()
    }
}
