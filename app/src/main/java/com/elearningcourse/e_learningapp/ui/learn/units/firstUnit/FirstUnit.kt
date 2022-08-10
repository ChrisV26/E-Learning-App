package com.elearningcourse.e_learningapp.ui.learn.units.firstUnit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.elearningcourse.e_learningapp.adapters.ScreenSlideFirstUnitAdapter
import com.elearningcourse.e_learningapp.databinding.FirstUnitFragmentBinding

class FirstUnit : Fragment() {

    private var _firstUnitBinding: FirstUnitFragmentBinding? = null
    private val firstUnitBinding get() = _firstUnitBinding!!

    private lateinit var viewModel: FirstUnitViewModel
    private lateinit var viewPager: ViewPager2

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
        setupViewPager()
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(FirstUnitViewModel::class.java)
    }

    private fun setupViewPager() {
        viewPager = firstUnitBinding.viewPager
        val viewPagerAdapter = ScreenSlideFirstUnitAdapter(
            childFragmentManager,
            lifecycle
        )

        viewPager.adapter= viewPagerAdapter
    }



}