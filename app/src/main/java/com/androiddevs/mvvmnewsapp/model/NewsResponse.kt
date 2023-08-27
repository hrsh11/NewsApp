package com.androiddevs.mvvmnewsapp.model

import com.androiddevs.mvvmnewsapp.model.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)