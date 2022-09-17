package com.elearningcourse.e_learningapp.ui.learn.units.firstUnit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.elearningcourse.e_learningapp.databinding.FirstUnitFragmentBinding

class FirstUnitFragment : Fragment() {

    private var _firstUnitBinding: FirstUnitFragmentBinding? = null
    private val firstUnitBinding get() = _firstUnitBinding!!

    private lateinit var viewModel: FirstUnitViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _firstUnitBinding = FirstUnitFragmentBinding.inflate(inflater, container, false)
        return firstUnitBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
        showFirstUnitMaterial()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(FirstUnitViewModel::class.java)
    }

    private fun showFirstUnitMaterial() {
        val firstUnitMaterialText =
            viewModel.readFirstUnitMaterial(requireContext(), "intro_to_astronomy.txt")
        firstUnitBinding.firstUnitMaterialTextView.text = firstUnitMaterialText
    }


}