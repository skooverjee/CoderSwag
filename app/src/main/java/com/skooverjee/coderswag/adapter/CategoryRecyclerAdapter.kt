package com.skooverjee.coderswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.skooverjee.coderswag.R
import com.skooverjee.coderswag.model.Category

class CategoryRecyclerAdapter(val context: Context, val categories: List<Category>,
                              val itemClick: (Category) -> Unit) :
    RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(context, categories[position])
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_list_item, parent, false)
        return Holder(view, itemClick)
    }

    inner class Holder(itemView: View, val itemClick: (Category) -> Unit) :  RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(context: Context, category: Category) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title

            itemView.setOnClickListener { itemClick(category) }
        }
    }

}