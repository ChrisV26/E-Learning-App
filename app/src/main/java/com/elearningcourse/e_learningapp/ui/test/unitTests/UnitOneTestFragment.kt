package com.elearningcourse.e_learningapp.ui.test.unitTests

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.core.view.forEachIndexed
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.elearningcourse.e_learningapp.databinding.FragmentUnitOneTestBinding
import com.elearningcourse.e_learningapp.ui.test.TestViewModel

class UnitOneTestFragment : Fragment() {

    private var _unitOneTestBinding: FragmentUnitOneTestBinding? = null
    private val unitOneTestBinding get() = _unitOneTestBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _unitOneTestBinding = FragmentUnitOneTestBinding.inflate(inflater, container, false)
        return unitOneTestBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _unitOneTestBinding = null
    }

}