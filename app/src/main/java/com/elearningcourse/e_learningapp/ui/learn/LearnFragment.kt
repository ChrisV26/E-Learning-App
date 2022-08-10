package com.elearningcourse.e_learningapp.ui.learn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.elearningcourse.e_learningapp.R
import com.elearningcourse.e_learningapp.databinding.FragmentLearnBinding
import com.google.android.material.button.MaterialButton

class LearnFragment : Fragment() {

    private lateinit var learnViewModel: LearnViewModel
    private var _binding: FragmentLearnBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLearnBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
        setClickListeners()
    }

    private fun setupViewModel() {
        learnViewModel =
            ViewModelProvider(this).get(LearnViewModel::class.java)
    }

    private fun setClickListeners() {
        val startButton: MaterialButton = binding.startLearnBtn
        startButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_learn_to_unit_selection_fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}