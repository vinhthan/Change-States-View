package com.example.changestatesview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv: TextView
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tv_click_me)
        btn = findViewById(R.id.button)

        tv.setOnClickListener {
            tv.isSelected = true
        }

        btn.setOnClickListener {
            btn.isSelected = true
        }

    }
}