package com.elearningcourse.e_learningapp.ui.test

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.elearningcourse.e_learningapp.R
import com.elearningcourse.e_learningapp.data.model.QuestionTemplate
import com.elearningcourse.e_learningapp.databinding.FragmentTestBinding
import com.elearningcourse.e_learningapp.util.Constants

class TestFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentTestBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<QuestionTemplate>? = null
    private var mSelectedOptionPosition: Int = 0

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
        mQuestionList = Constants.getQuestions()
        setQuestion()
        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setQuestion() {
        val question = mQuestionList!!.get(mCurrentPosition - 1)

        defaultOptionsView()
        if (mCurrentPosition == mQuestionList!!.size) {
            binding.btnSubmit.text = getString(R.string.finish)
        } else {
            binding.btnSubmit.text = getString(R.string.submit)
        }

        binding.progressBar.progress = mCurrentPosition
        binding.tvProgress.text = "$mCurrentPosition" + "/" + binding.progressBar.max

        binding.tvQuestion.text = question.question
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, binding.tvOptionOne)
        options.add(1, binding.tvOptionTwo)
        options.add(2, binding.tvOptionThree)
        options.add(3, binding.tvOptionFour)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                requireContext(),
                R.drawable.default_option_border_bg
            )
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                selectedOptionView(binding.tvOptionOne, 1)
            }
            R.id.tv_option_two -> {
                selectedOptionView(binding.tvOptionTwo, 2)
            }
            R.id.tv_option_three -> {
                selectedOptionView(binding.tvOptionThree, 3)
            }
            R.id.tv_option_four -> {
                selectedOptionView(binding.tvOptionFour, 4)
            }
            R.id.btn_submit -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            Toast.makeText(
                                requireContext(),
                                "You have successfully completed the Quiz", Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                } else {
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if (question!!.correctOption != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    } else {
                        answerView(question.correctOption, R.drawable.correct_option_border_bg)
                        Toast.makeText(requireContext(), "Good Job, Continue!", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if (mCurrentPosition == mQuestionList!!.size) {
                        binding.btnSubmit.text = getString(R.string.finish)
                    } else {
                        binding.btnSubmit.text = getString(R.string.next_question)
                    }
                    mSelectedOptionPosition = 0
                }

            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            requireContext(),
            R.drawable.selected_option_border_bg
        )
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                binding.tvOptionOne.background = ContextCompat.getDrawable(
                    requireContext(), drawableView
                )
            }
            2 -> {
                binding.tvOptionTwo.background = ContextCompat.getDrawable(
                    requireContext(), drawableView
                )
            }
            3 -> {
                binding.tvOptionThree.background = ContextCompat.getDrawable(
                    requireContext(), drawableView
                )
            }
            4 -> {
                binding.tvOptionFour.background = ContextCompat.getDrawable(
                    requireContext(), drawableView
                )
            }
        }
    }
}