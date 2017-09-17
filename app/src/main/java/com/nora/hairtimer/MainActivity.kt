package com.nora.hairtimer

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                showSavedTimersFragment()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                showQuickStartFragment()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        if (navigation.selectedItemId == R.id.navigation_home) {
            showSavedTimersFragment()
        } else {
            showQuickStartFragment()
        }
    }

    private fun showQuickStartFragment() {
        val quickStartFragment = QuickStartFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.layout_fragment_container, quickStartFragment)
        transaction.commit()
    }

    private fun showSavedTimersFragment() {
        val savedTimersFragment = SavedTimersFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.layout_fragment_container, savedTimersFragment)
        transaction.commit()
    }

}
