package com.sanket.pocadmanager

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.doubleclick.PublisherAdRequest
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd
import kotlinx.android.synthetic.main.activity_interstitial.*

class InterstitialActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, InterstitialActivity::class.java)
    }

    private lateinit var mPublisherInterstitialAd: PublisherInterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interstitial)

        mPublisherInterstitialAd = PublisherInterstitialAd(this)
        mPublisherInterstitialAd.adUnitId = "/6499/example/interstitial"
        mPublisherInterstitialAd.adListener = object: AdListener() {
            override fun onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                Toast.makeText(this@InterstitialActivity, "On ad loaded", Toast.LENGTH_SHORT).show()
            }

            override fun onAdFailedToLoad(adError: LoadAdError) {
                // Code to be executed when an ad request fails.
                Toast.makeText(this@InterstitialActivity, "On ad failed to load", Toast.LENGTH_SHORT).show()
            }

            override fun onAdOpened() {
                // Code to be executed when the ad is displayed.
                Toast.makeText(this@InterstitialActivity, "On ad opened", Toast.LENGTH_SHORT).show()
            }

            override fun onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                Toast.makeText(this@InterstitialActivity, "On ad clicked", Toast.LENGTH_SHORT).show()
            }

            override fun onAdLeftApplication() {
                // Code to be executed when the user has left the app.
                Toast.makeText(this@InterstitialActivity, "On ad left application", Toast.LENGTH_SHORT).show()
            }

            override fun onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                Toast.makeText(this@InterstitialActivity, "On ad closed", Toast.LENGTH_SHORT).show()
            }
        }
        mPublisherInterstitialAd.loadAd(PublisherAdRequest.Builder().addTestDevice("C5857832AAAD591F553A517D4C45CCC9").build())
        btnLoadInterstitial.setOnClickListener {
            if (mPublisherInterstitialAd.isLoaded) {
                mPublisherInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                Toast.makeText(this, "Interstitial wasn't loaded", Toast.LENGTH_SHORT).show()
            }
        }
    }
}