package com.skooverjee.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.skooverjee.coderswag.R
import com.skooverjee.coderswag.model.Product
import com.skooverjee.coderswag.utilities.EXTRA_PRODUCT
import com.skooverjee.coderswag.utilities.LOREM_IPSUM
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val selectedProduct = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        val resourceId = resources.getIdentifier(selectedProduct.image, "drawable", packageName)
        productDetailImage.setImageResource(resourceId)
        productDetailNameText.text = selectedProduct.title
        productDetailPriceText.text = selectedProduct.price
        productDetailDescriptionText.text = LOREM_IPSUM

        purchaseButton.setOnClickListener {
            Toast.makeText(this, "You have purchased a ${selectedProduct.title} for ${selectedProduct.price}!",
                Toast.LENGTH_LONG).show()
        }
    }


}
