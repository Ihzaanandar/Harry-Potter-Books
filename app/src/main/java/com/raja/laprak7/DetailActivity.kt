package com.raja.laprak7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.raja.laprak7.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra("title") ?: "-"
        val date = intent.getStringExtra("date") ?: "-"
        val desc = intent.getStringExtra("desc") ?: "No description available."
        val cover = intent.getStringExtra("cover")
        val pages = intent.getIntExtra("pages", 0)

        binding.tvDetailTitle.text = title
        binding.tvDetailDate.text = date
        binding.tvDetailDesc.text = desc
        binding.tvDetailPages.text = "Pages: $pages"


        Glide.with(this)
            .load(cover)
            .into(binding.ivDetailCover)
    }
}
