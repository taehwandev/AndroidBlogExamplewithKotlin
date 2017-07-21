package tech.thdev.blog_kotlinandroidsample.view.main

import android.arch.lifecycle.LifecycleActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import tech.thdev.blog_kotlinandroidsample.R
import tech.thdev.blog_kotlinandroidsample.view.main.search.SearchFragment

class MainActivity : LifecycleActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_search -> {
                supportFragmentManager.beginTransaction().replace(R.id.container, SearchFragment()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_like -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
