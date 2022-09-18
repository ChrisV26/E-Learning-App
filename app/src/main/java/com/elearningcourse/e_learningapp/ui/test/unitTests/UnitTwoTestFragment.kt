package com.elearningcourse.e_learningapp.ui.test.unitTests

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elearningcourse.e_learningapp.databinding.FragmentUnitTwoTestBinding

class UnitTwoTestFragment : Fragment() {

    private var _unitTwoTestBinding: FragmentUnitTwoTestBinding? = null
    private val unitTwoTestBinding get() = _unitTwoTestBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _unitTwoTestBinding = FragmentUnitTwoTestBinding.inflate(inflater, container, false)
        return unitTwoTestBinding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _unitTwoTestBinding = null
    }
}