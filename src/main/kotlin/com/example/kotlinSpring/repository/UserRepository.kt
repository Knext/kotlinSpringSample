package com.example.kotlinSpring.repository

import com.example.kotlinSpring.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login:String): User?
}
