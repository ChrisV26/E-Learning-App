package com.elearningcourse.e_learningapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "questions", indices = [Index("question_id")])
data class Question(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "question_id") var questionId: Int,
    @ColumnInfo(name = "question_text") val questionText: String,
    val category: String
)
