package com.sanket.pocadmanager

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.google.android.gms.ads.doubleclick.PublisherAdRequest
import kotlinx.android.synthetic.main.activity_banner.*
import java.util.*
import java.util.logging.Logger

class BannerActivity : AppCompatActivity() {

    companion object {

        val TAG = BannerActivity::class.simpleName

        fun newIntent(context: Context) = Intent(context, BannerActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner)

        /*val configuration = RequestConfiguration.Builder()
            .setTestDeviceIds(listOf("C5857832AAAD591F553A517D4C45CCC9")).build()

        MobileAds.setRequestConfiguration(configuration)

        Log.d(TAG, "onCreate: " + AdRequest.Builder().build().isTestDevice(this))*/

        publisherAdView.loadAd(PublisherAdRequest.Builder().addTestDevice("C5857832AAAD591F553A517D4C45CCC9").build())
    }
}