package com.example.nutriflow.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity.MODE_PRIVATE
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nutriflow.R

class PerfilFragment : Fragment() {

    private lateinit var btnProducto: Button
    private lateinit var nameUser: TextView
    private lateinit var emailUser: TextView
    private lateinit var phoneUser: TextView
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)

        btnProducto = view.findViewById(R.id.buttonEditProfile)
        nameUser = view.findViewById(R.id.nameProfile)
        emailUser = view.findViewById(R.id.emailUserProfile)
        phoneUser = view.findViewById(R.id.phoneUserProfile)

        sharedPreferences = requireActivity().getSharedPreferences("UserData", MODE_PRIVATE)

        val nombreRegistrado = sharedPreferences.getString("nombres", "") + " " + sharedPreferences.getString("apellidos", "")
        val correoRegistrado = sharedPreferences.getString("correo", "")
        val telefonoRegistrado = sharedPreferences.getString("telefono", "")

        nameUser.text = nombreRegistrado
        emailUser.text = correoRegistrado
        phoneUser.text = telefonoRegistrado

        btnProducto.setOnClickListener {
            findNavController().navigate(R.id.itemEditFragment)
        }

        return view
    }
}