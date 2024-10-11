package com.example.blogapp
    import android.view.View
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
        val titleTextView = itemView.findViewById<TextView>(R.id.textView2)

    }
