package com.elearningcourse.e_learningapp.ui.learn.units.thirdUnit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.viewpager2.widget.ViewPager2
import com.elearningcourse.e_learningapp.R
import com.elearningcourse.e_learningapp.adapters.ScreenSlideAdapter
import com.elearningcourse.e_learningapp.data.model.Planet
import com.elearningcourse.e_learningapp.databinding.ThirdUnitFragmentBinding

class ThirdUnitFragment : Fragment() {

    private var _thirdUnitFragmentBinding: ThirdUnitFragmentBinding? = null
    private val thirdUnitFragmentBinding: ThirdUnitFragmentBinding get() = _thirdUnitFragmentBinding!!
    private lateinit var viewPager: ViewPager2

    private val viewModel by viewModels<ThirdUnitViewModel> {
        ThirdUnitViewModel.PlanetListViewModelFactory(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _thirdUnitFragmentBinding = ThirdUnitFragmentBinding.inflate(inflater, container, false)
        return thirdUnitFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        viewPager = thirdUnitFragmentBinding.viewPager

        val viewPagerAdapter = ScreenSlideAdapter()

        val planetImagesAsResIds = arrayOf(
            R.drawable.earth,
            R.drawable.jupiter,
            R.drawable.mars,
            R.drawable.mercury,
            R.drawable.neptune,
            R.drawable.saturn,
            R.drawable.uranus,
            R.drawable.venus
        )

        viewModel.planetListLiveData.observe(requireActivity(), {
            it?.let {
                viewPagerAdapter.submitList(it as MutableList<Planet>)
            }
        })

        viewPager.adapter = viewPagerAdapter
    }

}