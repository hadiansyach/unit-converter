package com.d3if3032.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.d3if3032.unitconverter.databinding.ActivityMainBinding
import com.d3if3032.unitconverter.databinding.CalculationActivityBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}