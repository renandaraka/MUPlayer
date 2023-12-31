package com.raka.muplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.button.MaterialButton

class ListPlayerAdapter(val listPlayer: ArrayList<Player>) : RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder>() {
private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_player, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val player = listPlayer[position]

        Glide.with(holder.itemView.context)
            .load(player.photo)
            .into(holder.ivPhoto)

        holder.tvNama.text = player.name
        holder.tvDescription.text = player.description

        holder.mbDetail.setOnClickListener {
            onItemClickCallback.onItemClicked(listPlayer[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listPlayer.size
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_player_name)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_deskripsi)
        var ivPhoto: ImageView = itemView.findViewById(R.id.iv_photo)
        var mbDetail: MaterialButton = itemView.findViewById(R.id.mb_detail)
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Player)
    }
}

