package com.example

import com.example.models.ApiResponse
import com.example.repository.HereRepositoryImpl
import com.example.repository.HeroRepository
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import io.ktor.util.*
import kotlinx.serialization.json.Json
import org.koin.java.KoinJavaComponent.inject
import kotlin.test.*

class ApplicationTest {

    private val heroRepository: HeroRepository by inject(HeroRepository::class.java)
    @Test
    fun testRoot() = testApplication {

        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Welcome to Naruto API", bodyAsText())
        }
    }
    @OptIn(InternalAPI::class)
    @Test
    fun `'access all heroes endpoint, assert ok http status'`() = testApplication {
        val response = client.get("/boruto/heroes")

        assertEquals(HttpStatusCode.OK, response.status)
        val expected = ApiResponse(
            success = true,
            message = "ok",
            prevPage = null,
            nextPage = 2,
//                heroes = emptyList()
            heroes = heroRepository.page1
        )

        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
        assertEquals(expected, actual)
    }

    @Test
    fun `access all heroes endpoint, assert bad request http status`() = testApplication {

        client.get("/boruto/heroes?page=haha").apply {
            assertEquals(HttpStatusCode.BadRequest, status)
        }
    }

    @Test
    fun `'access all heroes endpoint, assert not found request http status'`() = testApplication {
        client.get("/boruto/heroes?page=6").apply {
            assertEquals(HttpStatusCode.NotFound, status)
        }
    }

    @Test
    fun `'access all heroes endpoint, query hero, assert single hero result'`() = testApplication {
        val response = client.get("/boruto/heroes/search?name=sasuke")

        assertEquals(HttpStatusCode.OK, response.status)


        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            .heroes.size
        assertEquals(1, actual)
    }

    @Test
    fun `'access all heroes endpoint, query hero, assert multi hero result'`() = testApplication {
        val response = client.get("/boruto/heroes/search?name=sa")

        assertEquals(HttpStatusCode.OK, response.status)


        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            .heroes.size
        assertEquals(3, actual)
    }

    @Test
    fun `'access all heroes endpoint, query an empty text, assert empty as a result'`() = testApplication {
        val response = client.get("/boruto/heroes/search?name=")

        assertEquals(HttpStatusCode.OK, response.status)


        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            .heroes
        assertEquals(emptyList(), actual)
    }

    @Test
    fun `'access all heroes endpoint, query non existing hero, assert empty as a result'`() = testApplication {
        val response = client.get("/boruto/heroes/search?name=unknown")

        assertEquals(HttpStatusCode.OK, response.status)


        val actual = Json.decodeFromString<ApiResponse>(response.bodyAsText())
            .heroes
        assertEquals(emptyList(), actual)
    }

}
