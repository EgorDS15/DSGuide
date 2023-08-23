package com.example.dsguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val animLogo = findViewById<LottieAnimationView>(R.id.logoSplash)

        Handler().postDelayed({
            val intent = Intent(this@MainActivity, MainScreen::class.java)
            startActivity(intent)
        }, 3000)
    }
}

