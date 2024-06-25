package com.ibrahimsolak.arayuztasarimi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ibrahimsolak.arayuztasarimi.R
import com.ibrahimsolak.arayuztasarimi.data.entitiy.Filmler
import com.ibrahimsolak.arayuztasarimi.databinding.FragmentAnasayfaBinding
import com.ibrahimsolak.arayuztasarimi.ui.adapter.FilmlerAdapter
import com.ibrahimsolak.arayuztasarimi.ui.adapter.FilmlerAdapterr
import java.util.ArrayList

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater,container, false)

        binding.AnasayfaRv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.AnasayfaRv2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.AnasayfaRv3.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        val filmlerListesi = ArrayList<Filmler>()
        val filmlerListesi2 = ArrayList<Filmler>()
        val filmlerListesi3 = ArrayList<Filmler>()

        val f1 = Filmler(1,"BATMAN","batman")
        val f2 = Filmler(2,"THE BOYS","theboys")
        val f3 = Filmler(3,"REACHER","reacher")
        val f4 = Filmler(4,"DAĞ","dag")
        val f5 = Filmler(5,"THE VOYEURS","thevoyeurs")
        val f6 = Filmler(6,"EDGE OF TOMORROW","edgeoftomorrow")
        val f7 = Filmler(7,"GUY RITCHIE'S THE COVENANT","guyritchiesthecovenant")
        val f8 = Filmler(8,"THE UNBEARABLE WEİGHT OF MASSIVE TALENT","theunbearableweightofmassivetalent")

        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)
        filmlerListesi.add(f7)
        filmlerListesi.add(f8)


        val k1 = Filmler(1,"DAĞ ","dag")
        val k2 = Filmler(2,"THE VOYEURS","thevoyeurs")
        val k3 = Filmler(3,"THE UNBEARABLE WEİGHT OF MASSIVE TALENT","theunbearableweightofmassivetalent")
        val k4 = Filmler(4,"EDGE OF TOMORROW","edgeoftomorrow")
        val k5 = Filmler(5,"DAĞ 2","dagg")
        val k6 = Filmler(6,"GUY RITCHIE'S THE COVENANT","guyritchiesthecovenant")

        filmlerListesi2.add(k1)
        filmlerListesi2.add(k2)
        filmlerListesi2.add(k3)
        filmlerListesi2.add(k4)
        filmlerListesi2.add(k5)
        filmlerListesi2.add(k6)


        val d1 = Filmler(1,"THE BOYS ","theboys")
        val d2 = Filmler(2,"BATMAN ","batman")
        val d3 = Filmler(3,"THE BOYS 2","theboyss")
        val d4 = Filmler(4,"BATMAN 2","batmann")
        val d5 = Filmler(5,"THE BOYS 3","theboysss")
        val d6 = Filmler(6,"BATMAN 3","batmannn")
        val d7 = Filmler(7,"BATMAN 4","batmannnn")

        filmlerListesi3.add(d1)
        filmlerListesi3.add(d2)
        filmlerListesi3.add(d3)
        filmlerListesi3.add(d4)
        filmlerListesi3.add(d5)
        filmlerListesi3.add(d6)
        filmlerListesi3.add(d7)


        val filmlerAdapter = FilmlerAdapter(requireContext(), filmlerListesi)
        binding.AnasayfaRv.adapter = filmlerAdapter

        val filmlerAdapter2 = FilmlerAdapterr(requireContext(), filmlerListesi2)
        binding.AnasayfaRv2.adapter = filmlerAdapter2

        val filmlerAdapter3 = FilmlerAdapterr(requireContext(), filmlerListesi3)
        binding.AnasayfaRv3.adapter = filmlerAdapter3

        var defaultButton = binding.buttonTumu
        defaultButton.isSelected = true
        defaultButton.setChipBackgroundColorResource(R.color.white)
        defaultButton.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))

        binding.buttonTumu.setOnClickListener {
            if (defaultButton != binding.buttonTumu) {
                defaultButton.isSelected = false
                defaultButton.setChipBackgroundColorResource(R.color.black)
                defaultButton.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
                defaultButton = binding.buttonTumu
                defaultButton.isSelected = true
                defaultButton.setChipBackgroundColorResource(R.color.white)
                defaultButton.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                binding.AnasayfaRv.visibility = View.VISIBLE
                binding.AnasayfaRv2.visibility = View.VISIBLE
                binding.AnasayfaRv3.visibility = View.VISIBLE

            }
        }

        binding.buttonFilmler.setOnClickListener {
            if (defaultButton != binding.buttonFilmler) {
                defaultButton.isSelected = false
                defaultButton.setChipBackgroundColorResource(R.color.black)
                defaultButton.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
                defaultButton = binding.buttonFilmler
                defaultButton.isSelected = true
                defaultButton.setChipBackgroundColorResource(R.color.white)
                defaultButton.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                binding.AnasayfaRv.visibility = View.INVISIBLE
                binding.AnasayfaRv3.visibility = View.INVISIBLE
                binding.AnasayfaRv2.visibility = View.VISIBLE

            }
        }

        binding.buttonDiziler.setOnClickListener {
            if (defaultButton != binding.buttonDiziler) {
                defaultButton.isSelected = false
                defaultButton.setChipBackgroundColorResource(R.color.black)
                defaultButton.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
                defaultButton = binding.buttonDiziler
                defaultButton.isSelected = true
                defaultButton.setChipBackgroundColorResource(R.color.white)
                defaultButton.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                binding.AnasayfaRv.visibility = View.INVISIBLE
                binding.AnasayfaRv2.visibility = View.INVISIBLE
                binding.AnasayfaRv3.visibility = View.VISIBLE

            }
        }


        return binding.root
    }

}