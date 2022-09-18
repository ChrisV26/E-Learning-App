package com.elearningcourse.e_learningapp.ui.test.unitTests

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elearningcourse.e_learningapp.databinding.FragmentUnitOneTestBinding
import com.elearningcourse.e_learningapp.ui.test.TestViewModel

class UnitOneTestFragment : Fragment() {

    private var _unitOneTestBinding: FragmentUnitOneTestBinding? = null
    private val unitOneTestBinding get() = _unitOneTestBinding!!

    private lateinit var testViewModel: TestViewModel

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
        //setupViewModel()
    }

    private fun setupViewModel() {
        TODO("Not yet implemented")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _unitOneTestBinding = null
    }

}