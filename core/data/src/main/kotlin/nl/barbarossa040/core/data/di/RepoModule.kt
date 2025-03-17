package nl.barbarossa040.core.data.di

import nl.barbarossa040.core.data.remote.MovieGateway
import nl.barbarossa040.core.data.remote.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    @Singleton
    fun provideMovieGateway(movieRepository: MovieRepository): MovieGateway = movieRepository
}