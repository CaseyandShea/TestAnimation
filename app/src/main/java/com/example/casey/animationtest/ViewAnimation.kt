package com.example.casey.animationtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_view_animation.*

class ViewAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)
        alpha.setOnClickListener {
            /*val alphaAnimation = AlphaAnimation(0f, 1f)
            alphaAnimation.duration = 2000//动画持续时间
            alphaAnimation.fillAfter = true//视图保持在结束状态
            alphaAnimation.fillBefore = false//动画保持开始状态
            alphaAnimation.repeatMode = Animation.REVERSE //重复的模式 Animation.RESTART：重新开始一次   Animation.REVERSE：反转
            alphaAnimation.repeatCount = 12//重复次数*/
            val alphaAnimation = AnimationUtils.loadAnimation(this@ViewAnimation, R.anim.alpha_animation)
            happy.startAnimation(alphaAnimation)
        }
    }
}
