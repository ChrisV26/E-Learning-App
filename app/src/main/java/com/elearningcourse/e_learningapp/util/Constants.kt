package com.elearningcourse.e_learningapp.util

import com.elearningcourse.e_learningapp.data.model.QuestionTemplate

object Constants {

    fun getQuestions(): ArrayList<QuestionTemplate> {
        val questionsList = ArrayList<QuestionTemplate>()

        val question1 = QuestionTemplate(
            1,
            "Astronomy is a natural science that studies?",
            "Celestial Objects",
            "Rocks",
            "Sea Life",
            "Stocks",
            1
        )

        questionsList.add(question1)

        val question2 = QuestionTemplate(
            1,
            "What is a branch of astronomy?",
            "Astrology",
            "Cosmology",
            "Zoology",
            "Biology",
            2
        )
        questionsList.add(question2)

        val question3 = QuestionTemplate(
            1,
            "The Solar System is located 26,000 light-years from the center of the?",
            "Andromeda Galaxy",
            "Fireworks Galaxy",
            "Medusa Merger",
            "Milky Way Galaxy",
            1
        )
        questionsList.add(question3)

        val question4 = QuestionTemplate(
            1,
            "Which is not a planet?",
            "Jupiter",
            "Earth",
            "Hephaestus",
            "Mars",
            3
        )
        questionsList.add(question4)

        return questionsList
    }
}