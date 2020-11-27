package com.pavansgroup.vishaltraining.mygl2rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var resultText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultText = findViewById(R.id.resultText)
        val rollButton: Button = findViewById(R.id.btnRoll)
        val countButton: Button = findViewById(R.id.btnCountUP)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener {
            val currenText = resultText.text.toString()
            if (currenText == "Hello World!") {
                resultText.text = 1.toString()
            } else if (currenText == "6") {
                resultText.text = currenText
            } else {
                var c = currenText.toInt()
                val d = c + 1
                resultText.text = d.toString()
            }
        }
    }

    private fun rollDice() {
        //Toast.makeText(this@MainActivity, "Button Clicked.", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }
}