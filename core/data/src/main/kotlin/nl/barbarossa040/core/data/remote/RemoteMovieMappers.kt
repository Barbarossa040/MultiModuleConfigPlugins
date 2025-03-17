package nl.barbarossa040.core.data.remote

import nl.barbarossa040.core.model.Movie
import nl.barbarossa040.core.model.MoviesResponse
import nl.barbarossa040.core.model.Movies
import nl.barbarossa040.core.model.NetworkMovie
import retrofit2.Response

fun Response<MoviesResponse>.asMovies(): Response<Movies> = Response.success(body()?.let {
    Movies(
        results = it.results.map { movies -> movies.asMovie() },
        currentPage = 1,
        totalPages = it.totalPages,
    )
})

fun Movie.asMovie() = NetworkMovie(
    id = id,
    title = title,
    overview = overview,
    posterPath = posterPath,
    voteAverage = voteAverage,
)