package com.elearningcourse.e_learningapp.data.model

import androidx.annotation.DrawableRes

/**
 * Model Planet
 * */
data class Planet(
    val id: Int,
    val name: String,
    @DrawableRes val planetImage: Int?,
    val description: String
)
