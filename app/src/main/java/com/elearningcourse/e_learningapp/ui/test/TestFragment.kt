package com.elearningcourse.e_learningapp.ui.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.elearningcourse.e_learningapp.R
import com.elearningcourse.e_learningapp.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    private var _binding: FragmentTestBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var testViewModel: TestViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
        setupClickListeners()
    }

    private fun setupViewModel() {
        testViewModel =
            ViewModelProvider(this).get(TestViewModel::class.java)
    }

    private fun setupClickListeners() {

        binding.buttonUnit1Test.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_test_selection_to_first_unit_test_fragment)
        }

        binding.buttonUnit2Test.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_test_selection_to_second_unit_test_fragment)
        }

        binding.buttonUnit3Test.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_test_selection_to_third_unit_test_fragment)
        }

        binding.buttonRevisionTest.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_test_selection_to_revision_test_fragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}