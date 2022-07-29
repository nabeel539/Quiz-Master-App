package com.example.quizmaster

import android.media.Image

data class Question(
    val id:Int,
    val question: String,
    val image: Int,
    val optOne: String,
    val optTwo: String,
    val optTree: String,
    val optFour: String,
    val correctAns: Int
)
