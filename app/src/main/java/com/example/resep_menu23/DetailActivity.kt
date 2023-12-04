package com.example.resep_menu23

import android.os.Build
import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.resep_menu23.ListHeroAdapter.OnItemClickCallback
import com.example.resep_menu23.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val KEY_HERO = "key_hero"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataHero: Hero? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            intent.getParcelableExtra(KEY_HERO)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(KEY_HERO)
        }

        dataHero?.let {
            binding.tvDetailName.text = it.name

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                binding.tvDetailDescription.text = Html.fromHtml(it.description, Html.FROM_HTML_MODE_COMPACT)
            } else {
                binding.tvDetailDescription.text = Html.fromHtml(it.description)
            }

            Glide.with(this)
                .load(it.photo)
                .into(binding.imgDetailPhoto)
        }
    }
}