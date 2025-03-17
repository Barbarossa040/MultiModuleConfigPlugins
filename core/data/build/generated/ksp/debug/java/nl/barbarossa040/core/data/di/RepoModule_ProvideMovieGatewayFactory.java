package nl.barbarossa040.core.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import nl.barbarossa040.core.data.remote.MovieGateway;
import nl.barbarossa040.core.data.remote.MovieRepository;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class RepoModule_ProvideMovieGatewayFactory implements Factory<MovieGateway> {
  private final Provider<MovieRepository> movieRepositoryProvider;

  public RepoModule_ProvideMovieGatewayFactory(Provider<MovieRepository> movieRepositoryProvider) {
    this.movieRepositoryProvider = movieRepositoryProvider;
  }

  @Override
  public MovieGateway get() {
    return provideMovieGateway(movieRepositoryProvider.get());
  }

  public static RepoModule_ProvideMovieGatewayFactory create(
      javax.inject.Provider<MovieRepository> movieRepositoryProvider) {
    return new RepoModule_ProvideMovieGatewayFactory(Providers.asDaggerProvider(movieRepositoryProvider));
  }

  public static RepoModule_ProvideMovieGatewayFactory create(
      Provider<MovieRepository> movieRepositoryProvider) {
    return new RepoModule_ProvideMovieGatewayFactory(movieRepositoryProvider);
  }

  public static MovieGateway provideMovieGateway(MovieRepository movieRepository) {
    return Preconditions.checkNotNullFromProvides(RepoModule.INSTANCE.provideMovieGateway(movieRepository));
  }
}
