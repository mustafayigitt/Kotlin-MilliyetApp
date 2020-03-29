package com.mustafayigit.kotlin_milliyetapp.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.adapter.CategoryNewsAdapter
import com.mustafayigit.kotlin_milliyetapp.mock.MockData
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        init()
    }


    private fun init() {
        viewPagerNewsCategory.adapter =
            CategoryNewsAdapter(
                supportFragmentManager,
                MockData.getNewsCategoryFragment()
            )

        tabNewsCategory.setupWithViewPager(viewPagerNewsCategory)
        toolbar.title = ""
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.appbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_alert -> {
                Toast.makeText(this, "Hatırlatıcı", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_feedback -> {
                Toast.makeText(this, "Geri Bildirim", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
