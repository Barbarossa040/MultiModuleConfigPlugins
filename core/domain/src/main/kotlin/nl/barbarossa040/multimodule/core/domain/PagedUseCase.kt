package nl.barbarossa040.multimodule.core.domain

import nl.barbarossa040.core.data.remote.MovieGateway
import nl.barbarossa040.core.model.Movies
import retrofit2.Response
import javax.inject.Inject

abstract class PagedUseCase @Inject constructor(
    internal val movieGateway: MovieGateway
) {
    abstract suspend operator fun invoke(page: Int) : Response<Movies>
}