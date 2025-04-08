package com.example.lab3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val cards: List<Card>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.title)
        val image: ImageView = view.findViewById(R.id.image)
        val genre: TextView = view.findViewById(R.id.genre)
        val info: TextView = view.findViewById(R.id.info)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val card = cards[position]
        holder.title.text = holder.itemView.context.getString(card.titleResourceId)
        holder.image.setImageResource(card.imageResourceId)
        holder.genre.text = "Жанр: ${holder.itemView.context.getString(card.genreResourceId)}"
        holder.info.text = holder.itemView.context.getString(card.infoResourceId)
    }

    override fun getItemCount() = cards.size
}