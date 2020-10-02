package com.sanket.pocadmanager

import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.core.view.marginBottom
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import kotlin.math.roundToInt


/**
 * Created by Sanket on 02/10/20.
 */
class BannersAdapter: RecyclerView.Adapter<BannersAdapter.BannerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : BannerViewHolder {
        val adview = AdView(parent.context)
        adview.adSize = AdSize.BANNER

        adview.adUnitId = "/6499/example/banner"

        val density: Float = parent.context.resources.displayMetrics.density
        val height = (AdSize.BANNER.height * density).roundToInt()
        val params = AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, height + 24)
        adview.layoutParams = params

        val request: AdRequest = AdRequest.Builder().addTestDevice("C5857832AAAD591F553A517D4C45CCC9").build()
        adview.loadAd(request)
        return BannerViewHolder(adview)
    }

    override fun getItemCount() = 20

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bind()
    }

    class BannerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind() {
            /*itemView.publisherAdView.apply {
                setAdSizes(AdSize.BANNER)
                adUnitId = "/6499/example/banner"
                loadAd(PublisherAdRequest.Builder().addTestDevice("C5857832AAAD591F553A517D4C45CCC9").build())
            }*/
        }

    }

}