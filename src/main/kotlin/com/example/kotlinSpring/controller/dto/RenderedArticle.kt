package com.example.kotlinSpring.controller.dto

import com.example.kotlinSpring.domain.User

data class RenderedArticle(
    val slug: String,
    val title: String,
    val headline: String,
    val content: String,
    val author: User,
    val addedAt: String
)
