package com.example.nutriflow.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nutriflow.R

class CategoriasFragment : Fragment() {

    private lateinit var cardElectronica : LinearLayout
    private lateinit var cardRopa : LinearLayout
    private lateinit var cardHogar : LinearLayout
    private lateinit var cardDeportes : LinearLayout
    private lateinit var cardAccesorios : LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_categorias, container, false)

        cardElectronica = view.findViewById(R.id.card_categoria_electronica)
        cardRopa = view.findViewById(R.id.card_categoria_ropa)
        cardHogar = view.findViewById(R.id.card_categoria_hogar)
        cardDeportes = view.findViewById(R.id.card_categoria_deportes)
        cardAccesorios = view.findViewById(R.id.card_categoria_accesorios)

        cardElectronica.setOnClickListener {
            findNavController().navigate(R.id.itemCatElectronicaFragment)
        }

        cardRopa.setOnClickListener {
            findNavController().navigate(R.id.itemCatRopaFragment)
        }

        cardHogar.setOnClickListener {
            findNavController().navigate(R.id.itemCatHogarFragment)
        }

        cardDeportes.setOnClickListener {
            findNavController().navigate(R.id.itemCatDeportesFragment)
        }

        cardAccesorios.setOnClickListener {
            findNavController().navigate(R.id.itemCatAccesoriosFragment)
        }
        return view
    }
}