package com.elearningcourse.e_learningapp.ui.learn.units

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.elearningcourse.e_learningapp.R
import com.elearningcourse.e_learningapp.databinding.FragmentUnitSelectionBinding
import com.google.android.material.button.MaterialButton

class UnitSelection : Fragment() {
    private var _unitSelectionBinding: FragmentUnitSelectionBinding? = null
    private val unitSelectionBinding get() = _unitSelectionBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _unitSelectionBinding = FragmentUnitSelectionBinding.inflate(inflater, container, false)
        return unitSelectionBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickListeners();
    }

    private fun setClickListeners() {
        val firstUnitButton: MaterialButton = unitSelectionBinding.unit1Button
        firstUnitButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_unit_selection_to_first_unit_fragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _unitSelectionBinding = null
    }

}