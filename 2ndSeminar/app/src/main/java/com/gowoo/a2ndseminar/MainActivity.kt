package com.gowoo.a2ndseminar

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v){
            main_btn_home -> {
                clearSelected()
                main_btn_home.isSelected = true
                replaceFragment(HomeTab())
            }
            main_btn_mine -> {
                clearSelected()
                main_btn_mine.isSelected = true
                replaceFragment(MineTab())
            }
            main_btn_add->{
                val intent = Intent(applicationContext, AddActivity::class.java)
                intent.putExtra("add_image", R.drawable.add_image)
                startActivity(intent)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(HomeTab())
        main_btn_home.isSelected = true
        main_btn_home.setOnClickListener(this)
        main_btn_mine.setOnClickListener(this)
        main_btn_add.setOnClickListener(this)


    }
    fun addFragment(fragment : Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.main_frame, fragment)
        transaction.commit()
    }

    fun replaceFragment(fragment : Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.main_frame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun clearSelected(){
        main_btn_home.isSelected = false
        //btn_main_search.isSelected = false
        //btn_main_news.isSelected = false
        main_btn_mine.isSelected = false
    }


}