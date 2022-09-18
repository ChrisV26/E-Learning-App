package com.elearningcourse.e_learningapp.data

import com.elearningcourse.e_learningapp.data.model.Answer
import com.elearningcourse.e_learningapp.data.model.Question

class QuestionProvider {
    var questionList = initQuestionList()
    var answerList = initAnswersList()

    private fun initQuestionList(): MutableList<Question> {
        val questions = mutableListOf<Question>()
        questions.add(
            Question(
                1,
                "Which of the following languages is not commonly used to develop Android Apps",
                "Unit One"
            )
        )
        questions.add(
            Question(
                2,
                "What is the meaning of Life?",
                "Unit One"
            )
        )

        questions.add(
            Question(
                3,
                "Which of the following languages is not commonly used to develop Android Apps",
                "Unit Two"
            )
        )
        questions.add(
            Question(
                4,
                "What is the meaning of Life?",
                "Unit Two"
            )
        )

        questions.add(
            Question(
                5,
                "Which of the following languages is not commonly used to develop Android Apps",
                "Unit Three"
            )
        )
        questions.add(
            Question(
                6,
                "What is the meaning of Life?",
                "Unit Three"
            )
        )

        questions.add(
            Question(
                7,
                "Which of the following languages is not commonly used to develop Android Apps",
                "Revision"
            )
        )
        questions.add(
            Question(8, "What is the meaning of Life?", "Unit Revision")
        )
        return questions
    }

    private fun initAnswersList(): MutableList<Answer> {
        val answers = mutableListOf<Answer>()
        answers.add(
            Answer(
                1, 1, false, "Java"
            )
        )
        answers.add(
            Answer(
                2, 1, false, "Kotlin"
            )
        )
        answers.add(
            Answer(
                3, 1, true, "Ruby"
            )
        )

        answers.add(
            Answer(
                4, 2, true, "42"
            )
        )
        answers.add(
            Answer(
                5, 2, false, "35"
            )
        )
        answers.add(
            Answer(
                6, 2, false, "7"
            )
        )
        return answers
    }
}