package com.example.whats_your_name.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.whats_your_name.databinding.FragmentMainBinding
import com.example.whats_your_name.viewModel.MainViewModel

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = FragmentMainBinding.inflate(inflater, container, false).also {
        it.lifecycleOwner = viewLifecycleOwner
        it.viewModel = viewModel
    }.root


}