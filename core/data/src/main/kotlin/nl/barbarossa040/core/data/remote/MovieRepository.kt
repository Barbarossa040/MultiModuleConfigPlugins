package nl.barbarossa040.core.data.remote

import nl.barbarossa040.core.model.Movies
import javax.inject.Inject
import retrofit2.Response

class MovieRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
): MovieGateway {

    override suspend fun getPopularMovies(page: Int): Response<Movies> {
        return remoteDataSource.getPopularMovies(page)
    }

    override suspend fun getNowPlayingMovies(page: Int): Response<Movies> {
        return remoteDataSource.getNowPlaying(page)
    }

    override suspend fun getUpcomingMovies(page: Int): Response<Movies> {
        return remoteDataSource.getUpcoming(page)
    }

}