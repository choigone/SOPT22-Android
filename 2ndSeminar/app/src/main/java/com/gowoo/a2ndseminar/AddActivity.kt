package com.gowoo.a2ndseminar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {

    var image : Int = 0
    //int name = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        image = intent.getIntExtra("add_image", 0)
        add_image.setImageResource(image)
    }
}