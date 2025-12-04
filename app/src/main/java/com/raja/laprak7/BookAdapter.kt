package com.raja.laprak7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import android.content.Intent
import com.raja.laprak7.databinding.ItemBookBinding

class BookAdapter(private var list: List<Book>) :
    RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemBookBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bind(book: Book) {
            binding.tvCardTitle.text = book.title
            binding.tvCardDate.text = book.releaseDate

            // Tambahkan Glide agar cover tampil
            Glide.with(binding.root.context)
                .load(book.cover)
                .into(binding.imgCover)

            // Click event untuk ke DetailActivity
            binding.root.setOnClickListener {
                val context = binding.root.context
                val intent = Intent(context, DetailActivity::class.java)

                intent.putExtra("title", book.title)
                intent.putExtra("date", book.releaseDate)
                intent.putExtra("desc", book.description)
                intent.putExtra("cover", book.cover)
                intent.putExtra("pages", book.pages)

                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBookBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
