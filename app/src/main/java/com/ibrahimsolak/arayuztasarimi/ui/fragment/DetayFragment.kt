package com.ibrahimsolak.arayuztasarimi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ibrahimsolak.arayuztasarimi.R
import com.ibrahimsolak.arayuztasarimi.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentDetayBinding.inflate(inflater,container, false)

        val bundle:DetayFragmentArgs by navArgs()
        val film = bundle.film

        binding.textViewName.text = film.ad

        binding.ivResimDetay.setImageResource(
            resources.getIdentifier(film.resimAd,"drawable", requireContext().packageName))


        return binding.root
    }

}