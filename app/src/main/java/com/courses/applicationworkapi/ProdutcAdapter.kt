package com.courses.applicationworkapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.courses.applicationworkapi.model.Product

class ProdutcAdapter(
    private val context: Context,
    private val productList: List<Product>): RecyclerView.Adapter<ProdutcViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutcViewHolder =
        ProdutcViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false))

    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ProdutcViewHolder, position: Int) {
        val item: Product = productList[position]
        holder.productName.text = item.prName
        holder.productPrice.text = item.prPriceL
        Glide.with(context).load(item.prImage).into(holder.productImage)
    }

}

class ProdutcViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val productImage: ImageView = itemView.findViewById(R.id.prod_image)
    val productName: TextView = itemView.findViewById(R.id.product_name)
    val productPrice: TextView = itemView.findViewById(R.id.product_price)
}