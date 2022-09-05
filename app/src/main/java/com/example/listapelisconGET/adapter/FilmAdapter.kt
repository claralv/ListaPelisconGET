package com.example.listapelisconGET.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listapelisconGET.R
import com.example.listapelisconGET.modelodatos.Result

class FilmAdapter(var filmList:List<Result>): RecyclerView.Adapter<FilmViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return FilmViewHolder(layoutInflater.inflate(R.layout.item_film,parent,false))
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val item = filmList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = filmList.size


}