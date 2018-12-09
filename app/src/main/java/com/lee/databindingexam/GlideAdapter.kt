package com.lee.databindingexam

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GlideAdapter {

    companion object {
        fun setImage(view: ImageView, imageUrl: String) {
            var mContext = view.context

            var options = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(mContext)
                .setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(view)
        }
    }

}