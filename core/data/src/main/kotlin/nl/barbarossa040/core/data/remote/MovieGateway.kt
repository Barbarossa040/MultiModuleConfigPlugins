package nl.barbarossa040.core.data.remote

import nl.barbarossa040.core.model.Movies
import retrofit2.Response


interface MovieGateway {
    suspend fun getPopularMovies(page: Int): Response<Movies>
    suspend fun getNowPlayingMovies(page: Int): Response<Movies>
    suspend fun getUpcomingMovies(page: Int): Response<Movies>
}