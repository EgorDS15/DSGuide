package com.example.dsguide

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val anima = findViewById<LottieAnimationView>(R.id.logoSplash)
    }
}

