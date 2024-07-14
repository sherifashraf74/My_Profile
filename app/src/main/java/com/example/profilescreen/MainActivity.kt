package com.example.profilescreen

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.profilescreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
            binding.linkedInBtn.setOnClickListener{
                openLinkedIn()
            }
            binding.facebookBtn.setOnClickListener{
                openFacebook()
            }
            binding.githubBtn.setOnClickListener{
                openGitHub()
            }
        binding.backBtn.setOnClickListener{
            val backIntent = Intent(this,ProfilePic::class.java)
            startActivity(backIntent)
    }

    }
    private fun openLinkedIn()
    {
        val linkedInUrl = "https://www.linkedin.com/in/cherif-ashraf"
        val intent1 = Intent(Intent.ACTION_VIEW, Uri.parse(linkedInUrl))
        startActivity(intent1)
    }
    private fun openFacebook()
    {
        val FacebookUrl = "https://sherifashrafportofolio.000webhostapp.com/"
        val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse(FacebookUrl))
        startActivity(intent2)
    }
    private fun openGitHub()
    {
        val gitHupUrl = "https://github.com/sherifashraf74"
        val intent3 = Intent(Intent.ACTION_VIEW, Uri.parse(gitHupUrl))
        startActivity(intent3)
    }
}