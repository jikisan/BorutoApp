package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

interface HeroRepositoryAlternative {

    val heroes: List<Hero>
    suspend fun getAllHerores(page: Int = 1, limit: Int = 3): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse

}