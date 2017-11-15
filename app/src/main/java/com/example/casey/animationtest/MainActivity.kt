package com.example.casey.animationtest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test_viewanimation.setOnClickListener {
            startActivity(Intent(this@MainActivity, ViewAnimation::class.java))
        }
    }
}
