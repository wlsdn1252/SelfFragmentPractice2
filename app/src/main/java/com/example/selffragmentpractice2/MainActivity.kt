package com.example.selffragmentpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.selffragmentpractice2.adapters.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mViewPagerAdapter : MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPagerAdapter = MainAdapter(supportFragmentManager)

        mainViewPager.adapter = mViewPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}