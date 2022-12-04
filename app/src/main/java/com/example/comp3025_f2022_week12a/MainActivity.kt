package com.example.comp3025_f2022_week12a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.Button
import androidx.fragment.app.Fragment



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var FragmentOneButton = findViewById<Button>(R.id.fragment_one_button)
        var FragmentTwoButton = findViewById<Button>(R.id.fragment_two_button)

        FragmentOneButton.setOnClickListener{

        }

        FragmentTwoButton.setOnClickListener{
            supportFragmentManager.commit{
                replace<FragmentTwo>(R.id.fragment_container)
            }
        }

    }
}