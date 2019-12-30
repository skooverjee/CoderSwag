package com.skooverjee.coderswag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.skooverjee.coderswag.R
import com.skooverjee.coderswag.adapter.ProductsRecyclerAdapter
import com.skooverjee.coderswag.service.DataService
import com.skooverjee.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val selectedCategory = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsRecyclerAdapter(this, DataService.getProducts(selectedCategory))

        var spanCount = 2
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)

        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }

}
