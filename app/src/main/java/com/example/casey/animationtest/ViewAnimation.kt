package com.example.casey.animationtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.Animation
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
            /* happy.animation = alphaAnimation
             alphaAnimation.startNow()*/
            alphaAnimation.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationRepeat(animation: Animation?) {
                    //当动画重复时执行
                }

                override fun onAnimationEnd(animation: Animation?) {
                    //当动画结束后调用
                }

                override fun onAnimationStart(animation: Animation?) {
                    //动画开始的时候调用
                }

            })
        }
        scale.setOnClickListener {
            /*
                        val scaleAnimation = ScaleAnimation(1.0f, 1.0f, 1.0f, 2.0f, 1.0f, 1f)
                        scaleAnimation.duration = 2000
            */

            val scaleAnimation = AnimationUtils.loadAnimation(this@ViewAnimation, R.anim.scale_animation)
            happy.startAnimation(scaleAnimation)
        }
    }
}
