package com.d3if3032.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.d3if3032.unitconverter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWeight.setOnClickListener() {
            val pindahCalculationIntent = Intent(this, WeightActivity::class.java)
            startActivity(pindahCalculationIntent)
        }
    }
}