package com.example.introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // list of fragments
        val fragmentList = arrayListOf<Fragment>(
            Sample1Fragment(),
            Sample2Fragment(),
            Sample3Fragment(),
            Sample4Fragment()
        )

        // create isntance of adapters
        val adapter = SamplePagerAdapter(supportFragmentManager, fragmentList)
        /// set adapter
        viewPager.adapter = adapter
    }
}