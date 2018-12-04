package com.example.zhubingning.multiimage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_image_card.view.*

class ImageListAdapter : BaseAdapter {
    var imageList = ArrayList<String>()
    var context: Context? = null

    constructor(context: Context, imageList: ArrayList<String>) : super() {
        this.context = context
        this.imageList = imageList
    }

    override fun getCount(): Int {
        return imageList.size
    }

    override fun getItem(position: Int): Any {
        return imageList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageUrl = this.imageList[position]

        val inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val imageCard = inflator.inflate(R.layout.item_image_card, null)
        Glide.with(context).load(imageUrl).into(imageCard.image)
        return imageCard
    }
}