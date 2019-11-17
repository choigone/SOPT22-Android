package com.gowoo.a2ndseminar


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.fragment_mine.*

class MineActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v) {
            mine_btn_one -> {
                clearSelected()
                mine_btn_one.isSelected = true
                replaceFragment(AlignTab())
            }
            mine_btn_all -> {
                clearSelected()
                mine_btn_all.isSelected = true
                replaceFragment(AllTab())
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_mine)
        addFragment(AllTab())
        mine_btn_all.isSelected = true
        mine_btn_all.setOnClickListener(this)
        mine_btn_one.setOnClickListener(this)
    }

    fun addFragment(fragment : Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.mine_frame, fragment)
        transaction.commit()
    }

    fun replaceFragment(fragment : Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.replace(R.id.mine_frame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun clearSelected(){
        mine_btn_all.isSelected = false

        mine_btn_one.isSelected = false
    }
}
