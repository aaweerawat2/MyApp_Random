package com.example.aaa.myapplication3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBT = findViewById<Button>(R.id.rollBT)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val sentBT1 = findViewById<Button>(R.id.sentBT1)

        sentBT1.setOnClickListener{
            resultTextView.text = "กรุณาใส่ชื่อ-นามสกุล"
        }
        rollBT.setOnClickListener{
            val rand= Random.nextInt(seekBar.progress)
            resultTextView.text = rand.toString()
        }

    }
}
