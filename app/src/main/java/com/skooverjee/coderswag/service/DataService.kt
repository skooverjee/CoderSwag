package com.skooverjee.coderswag.service

import com.skooverjee.coderswag.model.Category
import com.skooverjee.coderswag.model.Product

object DataService {

    val categories = listOf<Category>(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf<Product>(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf<Product>(
        Product("Devslopes Hoodie Grey", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Hoodie Grey2", "$28", "hoodie3"),
        Product("Devslopes Hoodie Black", "$32", "hoodie4"),
        Product("Devslopes Hoodie Grey", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Hoodie Grey2", "$28", "hoodie3"),
        Product("Devslopes Hoodie Black", "$32", "hoodie4")
    )

    val shirts = listOf<Product>(
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Grey", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Grey", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when (category) {
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGoods
        }
    }

}