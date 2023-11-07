package com.example.penguintraininggame

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.penguintraininggame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        findViewById<ImageView>(R.id.home_menu).setOnClickListener {
            navController.navigate(R.id.navigation_home)
        }
        findViewById<ImageView>(R.id.shop_menu).setOnClickListener {
            navController.navigate(R.id.navigation_shop)
        }
        findViewById<ImageView>(R.id.dressup_menu).setOnClickListener {
            navController.navigate(R.id.navigation_dressup)
        }
        findViewById<ImageView>(R.id.collection_menu).setOnClickListener {
            navController.navigate(R.id.navigation_collection)
        }
    }

}