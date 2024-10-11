package com.example.blogapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class ArticlesAdapter(val articles: List<Article>): RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.activity_cardview_article,parent,false)
        return ArticleViewHolder(view)

    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articles[position]
        holder.imageView.setImageResource(article.imageId)
        holder.titleTextView.text = article.title
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ArticleDetail::class.java)
            intent.putExtra("title", article.title)
            intent.putExtra("image", article.imageId)
            intent.putExtra("description", article.description) // Pass description here
            holder.itemView.context.startActivity(intent)
        }
    }

}
