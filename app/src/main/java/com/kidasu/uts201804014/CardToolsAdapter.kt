package com.kidasu.uts201804014

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardToolsAdapter(private val listMinuman: ArrayList<Tools>) : RecyclerView.Adapter<CardToolsAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvKode: TextView = itemView.findViewById(R.id.tv_kode)
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvHarga: TextView = itemView.findViewById(R.id.tv_harga)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_tools)
        var btnPindah: Button = itemView.findViewById(R.id.btn_send)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_tools_card, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMinuman.size
    }

    override fun onBindViewHolder(holder: CardToolsAdapter.CardViewHolder, position: Int) {
        val minuman = listMinuman[position]

        Glide.with(holder.itemView.context)
            .load(minuman.logo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.ivLogo)
        holder.tvKode.text = minuman.kode
        holder.tvNama.text = minuman.nama
        holder.tvHarga.text = minuman.harga
        holder.btnPindah.setOnClickListener {
            val intent = Intent(holder.itemView.context, Pembelian::class.java)
            val bundle = Bundle()
            bundle.putString("data1", minuman.nama)
            intent.putExtras(bundle)
            holder.itemView.context.startActivity(intent)
        }
    }
}