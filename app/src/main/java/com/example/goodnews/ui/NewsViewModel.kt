package com.example.goodnews.ui

import androidx.lifecycle.ViewModel
import com.example.goodnews.ui.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}