package com.skooverjee.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.skooverjee.coderswag.R
import com.skooverjee.coderswag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryName = intent.getStringExtra(EXTRA_CATEGORY)
        Toast.makeText(this, "Selected $categoryName category", Toast.LENGTH_SHORT).show()
    }

}
