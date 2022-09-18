package com.elearningcourse.e_learningapp.ui.test.unitTests

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elearningcourse.e_learningapp.databinding.FragmentUnitThreeTestBinding

class UnitThreeTestFragment : Fragment() {

    private var _unitThreeTestBinding: FragmentUnitThreeTestBinding? = null
    private val unitThreeTestBinding get() = _unitThreeTestBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _unitThreeTestBinding = FragmentUnitThreeTestBinding.inflate(inflater, container, false)
        return unitThreeTestBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _unitThreeTestBinding = null
    }
}