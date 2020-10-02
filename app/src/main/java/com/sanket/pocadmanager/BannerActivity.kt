package com.sanket.pocadmanager

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
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

        rvBanners.apply {
            layoutManager = LinearLayoutManager(this@BannerActivity)
            adapter = BannersAdapter()
        }

    }
}