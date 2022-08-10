package com.elearningcourse.e_learningapp.ui.learn.units.firstUnit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elearningcourse.e_learningapp.R

class FirstUnitMaterial : Fragment() {
    //TODO: Hook up DB with learning material and show it ot user via the view pager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_unit_material, container, false)
    }


}