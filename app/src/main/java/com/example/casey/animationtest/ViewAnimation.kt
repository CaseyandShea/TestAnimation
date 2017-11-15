package com.example.casey.animationtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AlphaAnimation
import kotlinx.android.synthetic.main.activity_view_animation.*

class ViewAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)
        alpha.setOnClickListener {
            val alphaAnimation = AlphaAnimation(0f, 1f)
            alphaAnimation.duration = 2000//动画持续时间
            alphaAnimation.fillAfter = true
            happy.startAnimation(alphaAnimation)
        }
    }
}
