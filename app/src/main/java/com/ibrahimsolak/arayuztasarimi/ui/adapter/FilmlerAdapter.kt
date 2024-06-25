package com.ibrahimsolak.arayuztasarimi.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ibrahimsolak.arayuztasarimi.data.entitiy.Filmler
import com.ibrahimsolak.arayuztasarimi.databinding.CardTasarimBinding
import com.ibrahimsolak.arayuztasarimi.databinding.FragmentAnasayfaBinding
import com.ibrahimsolak.arayuztasarimi.ui.fragment.AnasayfaFragmentDirections

class FilmlerAdapter(var mContext: Context,var filmlerListesi: List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerListesi.get(position)
        val t = holder.tasarim
        t.imageView.setImageResource(mContext.resources.getIdentifier(film.resimAd,"drawable",mContext.packageName))

        t.cardViewFilm.setOnClickListener(){
            val gecis = AnasayfaFragmentDirections.detayGecis(film = film)
            Navigation.findNavController(it).navigate(gecis)
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }
}
