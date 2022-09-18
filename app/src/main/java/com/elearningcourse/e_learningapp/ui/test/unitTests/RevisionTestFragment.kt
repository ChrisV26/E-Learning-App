package com.elearningcourse.e_learningapp.ui.test.unitTests

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elearningcourse.e_learningapp.databinding.FragmentRevisionTestBinding

class RevisionTestFragment : Fragment() {

    private var _revisionTestBinding: FragmentRevisionTestBinding? = null
    private val revisionTestBinding get() = _revisionTestBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _revisionTestBinding = FragmentRevisionTestBinding.inflate(inflater, container, false)
        return revisionTestBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _revisionTestBinding = null
    }

}