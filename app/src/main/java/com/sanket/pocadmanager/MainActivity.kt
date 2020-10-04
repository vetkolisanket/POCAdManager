package com.sanket.pocadmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        btnAdMob.setOnClickListener { startActivity(AdMobActivity.newIntent(this)) }
        btnAdMobInterstitial.setOnClickListener { startActivity(AdMobInterstitialActivity.newIntent(this)) }
        btnBanner.setOnClickListener { startActivity(BannerActivity.newIntent(this)) }
        btnInterstitial.setOnClickListener { startActivity(InterstitialActivity.newIntent(this)) }
    }
}