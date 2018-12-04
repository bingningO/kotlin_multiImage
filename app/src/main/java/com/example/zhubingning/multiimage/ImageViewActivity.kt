package com.example.zhubingning.multiimage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_imagelist.*

class ImageViewActivity : AppCompatActivity() {

    private lateinit var imageUrlList: ArrayList<String>
    private val IMAGE_URL = "https://nekowara.com/wp-content/uploads/2016/10/cat-882049_640.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagelist)

        setImageData()
        setImageListView()
    }

    private fun setImageData() {
        imageUrlList = ArrayList()
        for (i in 0..99) {
            imageUrlList.add(IMAGE_URL)
        }
    }

    private fun setImageListView() {
        val adapter = ImageListAdapter(this, imageUrlList)
        imageList.adapter = adapter
    }
}