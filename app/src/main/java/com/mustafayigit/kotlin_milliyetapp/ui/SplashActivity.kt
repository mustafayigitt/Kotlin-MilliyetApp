package com.mustafayigit.kotlin_milliyetapp.ui

import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.util.extStartActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        txtSplash.animation = AnimationUtils.loadAnimation(this, R.anim.animation_splashs_screen)
        imgSplash.animation = AnimationUtils.loadAnimation(this, R.anim.animation_splashs_screen)

        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                this@SplashActivity extStartActivity DashboardActivity::class.java
                this@SplashActivity.finish()
            }

            override fun onTick(millisUntilFinished: Long) {}

        }.start()

    }
}
