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

class CardGunplaAdapter(private val listGunpla: ArrayList<Gunpla>) : RecyclerView.Adapter<CardGunplaAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvKode: TextView = itemView.findViewById(R.id.tv_kode)
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvHarga: TextView = itemView.findViewById(R.id.tv_harga)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_gunpla)
        var btnPindah: Button = itemView.findViewById(R.id.btn_send)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_gunpla_card, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGunpla.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val gunpla = listGunpla[position]

        Glide.with(holder.itemView.context)
            .load(gunpla.logo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.ivLogo)
        holder.tvKode.text = gunpla.kode
        holder.tvNama.text = gunpla.nama
        holder.tvHarga.text = gunpla.harga
        holder.btnPindah.setOnClickListener {
            val intent = Intent(holder.itemView.context, Pembelian::class.java)
            val bundle = Bundle()
            bundle.putString("data1", gunpla.nama)
            intent.putExtras(bundle)
            holder.itemView.context.startActivity(intent)
        }
    }
}