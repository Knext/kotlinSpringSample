package com.example.kotlinSpring.domain

import com.example.kotlinSpring.controller.HtmlController
import com.example.kotlinSpring.controller.dto.RenderedArticle
import com.example.kotlinSpring.util.format
import com.example.kotlinSpring.util.toSlug
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Article(
    var title: String,
    var headline: String,
    var content: String,
    @ManyToOne var author: User,
    var slug: String = title.toSlug(),
    var addedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue var id: Long? = null)

fun Article.render() = RenderedArticle(
    slug,
    title,
    headline,
    content,
    author,
    addedAt.format()
)
