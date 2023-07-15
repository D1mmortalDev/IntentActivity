package com.example.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMainScreen.setOnClickListener {
            val myIntent = Intent(this,WelcomeActivity::class.java)
            val myName = binding.editTxtMainScreen.text.toString()
            myIntent.putExtra("myName",myName)
            startActivity(myIntent)
            finish()
        }
    }
}