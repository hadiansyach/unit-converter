package com.d3if3032.unitconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.d3if3032.unitconverter.databinding.WeightActivityBinding

class WeightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = WeightActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
