package com.example.goodnews.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.goodnews.R
import com.example.goodnews.ui.MainActivity
import com.example.goodnews.ui.NewsViewModel

class SavedNewsFragment : Fragment(R.layout.fragment_saved_news) {

    lateinit var viewModel:NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel

    }
}