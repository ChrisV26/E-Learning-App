package com.elearningcourse.e_learningapp.ui.learn.units.thirdUnit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.elearningcourse.e_learningapp.databinding.ThirdUnitFragmentBinding

class ThirdUnitFragment : Fragment() {
    private var _thirdUnitFragmentBinding: ThirdUnitFragmentBinding? = null
    private val thirdUnitFragmentBinding: ThirdUnitFragmentBinding get() = _thirdUnitFragmentBinding!!
    private lateinit var viewModel: ThirdUnitViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _thirdUnitFragmentBinding = ThirdUnitFragmentBinding.inflate(inflater, container, false)
        return thirdUnitFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(ThirdUnitViewModel::class.java)
    }

}