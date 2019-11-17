package com.gowoo.a3rdseminar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var kakaoItems : ArrayList<KaKaoItem>
    lateinit var kaKaoAdapter: KaKaoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        kakaoItems = ArrayList()
        kakaoItems.add(KaKaoItem(R.drawable.pic1, "첫번째", "1이다", "오후 1:00"))
        kakaoItems.add(KaKaoItem(R.drawable.pic2, "첫번째", "1이다", "오후 1:00"))
        kakaoItems.add(KaKaoItem(R.drawable.pic3, "첫번째", "1이다", "오후 1:00"))
        kakaoItems.add(KaKaoItem(R.drawable.pic4, "첫번째", "1이다", "오후 1:00"))
        kakaoItems.add(KaKaoItem(R.drawable.pic5, "첫번째", "1이다", "오후 1:00"))
        kakaoItems.add(KaKaoItem(R.drawable.pic6, "첫번째", "1이다", "오후 1:00"))
        kakaoItems.add(KaKaoItem(R.drawable.pic7, "첫번째", "1이다", "오후 1:00"))
        kakaoItems.add(KaKaoItem(R.drawable.pic8, "첫번째", "1이다", "오후 1:00"))
        kakaoItems.add(KaKaoItem(R.drawable.pic9, "첫번째", "1이다", "오후 1:00"))
        kakaoItems.add(KaKaoItem(R.drawable.pic1, "첫번째", "1이다", "오후 1:00"))

        kaKaoAdapter = KaKaoAdapter(kakaoItems)
        main_rv.layoutManager = LinearLayoutManager(this)
        main_rv.adapter = kaKaoAdapter

    }
}