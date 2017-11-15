package com.example.casey.animationtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_view_animation.*

class ViewAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)
        alpha.setOnClickListener {
            val alphaAnimation = AlphaAnimation(0f, 1f)
            alphaAnimation.duration = 2000//动画持续时间
            alphaAnimation.fillAfter = true
            alphaAnimation.repeatMode = Animation.REVERSE //重复的模式 Animation.RESTART：重新开始一次   Animation.REVERSE：反转
            alphaAnimation.repeatCount = 12//重复次数
            happy.startAnimation(alphaAnimation)
        }
    }
}
