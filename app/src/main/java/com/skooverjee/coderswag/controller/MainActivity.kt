package com.skooverjee.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.skooverjee.coderswag.R
import com.skooverjee.coderswag.adapter.CategoryRecyclerAdapter
import com.skooverjee.coderswag.service.DataService
import com.skooverjee.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories) { category ->
            val productsActivity = Intent( this, ProductsActivity::class.java)
            productsActivity.putExtra(EXTRA_CATEGORY, category.title)

            startActivity(productsActivity)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }

}
