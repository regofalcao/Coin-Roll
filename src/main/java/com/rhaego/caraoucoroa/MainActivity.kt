package com.rhaego.caraoucoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var coinImage: ImageView
    private lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton = findViewById(R.id.roll_button)
        rollButton.text = "Roll"
        rollButton.setOnClickListener {
            roll()

        }

        coinImage = findViewById(R.id.coin_image)
    }

    private fun roll() {

        val drawableResource = when (Random().nextInt(2) + 1) {
            1 -> R.drawable.verso
            2 -> R.drawable.frente
            else -> R.drawable.empty_dice
        }
        coinImage.setImageResource(drawableResource)
    }
}