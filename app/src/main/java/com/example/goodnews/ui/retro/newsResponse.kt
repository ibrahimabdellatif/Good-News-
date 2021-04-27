package com.example.goodnews.ui.retro

data class newsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)