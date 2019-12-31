package com.skooverjee.coderswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.skooverjee.coderswag.R
import com.skooverjee.coderswag.model.Product

class ProductsRecyclerAdapter(val context: Context, val products: List<Product>, val itemClick: (Product) -> Unit) :
    RecyclerView.Adapter<ProductsRecyclerAdapter.ProductHolder>() {

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(context, products[position])
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view, itemClick)
    }

    inner class ProductHolder(itemView: View, val itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        val productName = itemView.findViewById<TextView>(R.id.productNameText)
        val productPrice = itemView.findViewById<TextView>(R.id.productPriceText)

        fun bindProduct(context: Context, product: Product) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price

            itemView.setOnClickListener { itemClick(product) }
        }
    }

}