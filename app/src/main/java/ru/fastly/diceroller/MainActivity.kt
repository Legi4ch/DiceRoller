package ru.fastly.diceroller

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.fastly.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rollButton = binding.button
        val diceImage = binding.imageView


        rollButton.setOnClickListener {
            val myDice = Dice(Utils.facets)
            val drawableResource = when (myDice.roll()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(drawableResource)
            diceImage.contentDescription = myDice.toString()
            val toast = Toast.makeText(this, Utils.message, Toast.LENGTH_SHORT)
            toast.show()

        }




    }
}