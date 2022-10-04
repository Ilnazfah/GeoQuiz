package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        setListeners()
    }

    private fun initData() {
        trueButton = findViewById(R.id.trueButton)
        falseButton = findViewById(R.id.falseButton)
    }

    private fun setListeners() {
        trueButton.setOnClickListener { showToast(R.string.correct_toast) }
        falseButton.setOnClickListener { showToast(R.string.incorrect_toast) }
    }

    private fun showToast(textId: Int) {
        val toast = Toast.makeText(this, textId, Toast.LENGTH_SHORT)
        toast.apply {
            setGravity(Gravity.TOP, 0, 0)
            show()
        }
    }
}