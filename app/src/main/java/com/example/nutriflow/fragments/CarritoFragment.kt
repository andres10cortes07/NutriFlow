package com.example.nutriflow.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.nutriflow.R

class CarritoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_carrito, container, false)

        // Buscar el botón "Eliminar"
        val botonEliminar = view.findViewById<Button>(R.id.btnEliminarProducto)

        botonEliminar?.setOnClickListener {
            var parentView = it.parent as? View

            while (parentView != null && parentView.id != R.id.card_producto_en_carrito) {
                parentView = parentView.parent as? View
            }

            (parentView?.parent as? ViewGroup)?.removeView(parentView)
        }

        return view
    }
}
