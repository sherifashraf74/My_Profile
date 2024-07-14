package com.example.profilescreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.profilescreen.databinding.ActivityMainBinding
import com.example.profilescreen.databinding.ActivityProfilePicBinding

class ProfilePic : AppCompatActivity() {
    private lateinit var binding: ActivityProfilePicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfilePicBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainBtn.setOnClickListener {
            val firstIntent = Intent(this, MainActivity::class.java)
            startActivity(firstIntent)
        }
    }

}