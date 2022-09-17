package com.elearningcourse.e_learningapp.ui.learn.units.secondUnit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.elearningcourse.e_learningapp.databinding.SecondUnitFragmentBinding

class SecondUnitFragment : Fragment() {

    private var _secondUnitFragmentBinding: SecondUnitFragmentBinding? = null
    private val secondUnitFragmentBinding get() = _secondUnitFragmentBinding!!

    private lateinit var viewModel: SecondUnitViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _secondUnitFragmentBinding = SecondUnitFragmentBinding.inflate(inflater, container, false)
        return secondUnitFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
        showSecondUnitMaterial()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(SecondUnitViewModel::class.java)
    }

    private fun showSecondUnitMaterial() {
        val secondUnitMaterialText =
            viewModel.readFromSecondMaterial(requireContext(), "intro_to_solar_system.txt")

        secondUnitFragmentBinding.secondUnitMaterialTextView.text = secondUnitMaterialText
    }

}