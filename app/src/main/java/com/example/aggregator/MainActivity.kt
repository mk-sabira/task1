package com.example.aggregator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aggregator.screens.Authorization

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openAuthFragment()
    }

    private fun openAuthFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, Authorization.newInstance())
            .commit()
    }
}