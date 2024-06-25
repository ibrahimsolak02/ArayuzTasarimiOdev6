package com.ibrahimsolak.arayuztasarimi.ui.adapter

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ibrahimsolak.arayuztasarimi.R
import com.ibrahimsolak.arayuztasarimi.data.entitiy.Filmler
import com.ibrahimsolak.arayuztasarimi.databinding.CardTasarim2Binding
import com.ibrahimsolak.arayuztasarimi.databinding.CardTasarimBinding
import com.ibrahimsolak.arayuztasarimi.ui.fragment.AnasayfaFragmentDirections

class FilmlerAdapterr(var mContext: Context, var filmlerListesi2: List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapterr.CardTasarimTutucu2>(){

    inner class CardTasarimTutucu2(var tasarim2: CardTasarim2Binding) : RecyclerView.ViewHolder(tasarim2.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu2 {
        val binding2 = CardTasarim2Binding.inflate(LayoutInflater.from(mContext),parent, false)
        return CardTasarimTutucu2(binding2)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu2, position: Int) {
        val film2 = filmlerListesi2.get(position)
        val k = holder.tasarim2
        k.imageView2.setImageResource(mContext.resources.getIdentifier(film2.resimAd,"drawable",mContext.packageName))

        k.cardViewFilm2.setOnClickListener(){
            val gecis2 = AnasayfaFragmentDirections.detayGecis(film = film2)
            Navigation.findNavController(it).navigate(gecis2)
        }
    }

    override fun getItemCount(): Int {
        return filmlerListesi2.size
    }
}