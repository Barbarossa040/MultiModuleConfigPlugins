package nl.barbarossa040.multimodule.core.domain

import nl.barbarossa040.core.data.remote.MovieGateway
import nl.barbarossa040.core.model.Movies
import retrofit2.Response
import javax.inject.Inject

class NowPlayingUseCase(movieGateway: MovieGateway): PagedUseCase(movieGateway) {
    override suspend operator fun invoke(page: Int): Response<Movies> {
        return movieGateway.getNowPlayingMovies(page)
    }
}