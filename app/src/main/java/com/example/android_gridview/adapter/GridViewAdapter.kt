package com.example.android_gridview.adapter

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.android_gridview.R
import com.example.android_gridview.Utils.Utils
import com.example.android_gridview.model.Post
import java.util.zip.Inflater

class GridViewAdapter(var activity: Activity, var items: ArrayList<Post>) : BaseAdapter() {

    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Post {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return items[position].id
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var item = items[position]

        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_gridview, parent, false)

        var iv_image = view.findViewById<ImageView>(R.id.iv_image)
        setViewHeight(iv_image)
        Glide.with(activity.applicationContext).load(item.image).placeholder(
            ColorDrawable(Color.parseColor(item.backgroundColor))
        ).into(iv_image)

        return view
    }

    private fun setViewHeight(view: View) {
        val params: ViewGroup.LayoutParams = view.layoutParams
        params.height = Utils.screenSize(activity.application).width / 2
        view.setLayoutParams(params)
    }
}