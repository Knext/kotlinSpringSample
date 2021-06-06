package com.example.kotlinSpring.repository

import com.example.kotlinSpring.domain.Article
import com.example.kotlinSpring.domain.User
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class ArticleRepositoryTest @Autowired constructor(
    val entityManager: TestEntityManager,
    val articleRepository: ArticleRepository) {

    @Test
    fun `When findByIdOrNull then return Article`() {
        val user = User("spring", "first", "second")
        entityManager.persist(user)
        val article = Article("Spring Framework 5.0 goes GA", "Dear Spring community ...", "Lorem ipsum", user)
        entityManager.persist(article)
        entityManager.flush()

        val found = articleRepository.findByIdOrNull(article.id!!)
        assertThat(found).isEqualTo(article)
    }

}
