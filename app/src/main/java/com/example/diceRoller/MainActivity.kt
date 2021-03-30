package com.example.diceRoller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceRoller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
    val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val rollButtones = binding.rollButton
        rollButtones.text = "Roll Baby"
        rollButtones.setOnClickListener {
            rollDice(binding)
        }
    }

    private fun rollDice(binding: ActivityMainBinding) {
        val randomDiceNumbers = Random().nextInt(6).plus(1)
        val drawableResource = when(randomDiceNumbers){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }


        val diceImage = binding.diceImage
        diceImage.setImageResource(drawableResource)
    }
}