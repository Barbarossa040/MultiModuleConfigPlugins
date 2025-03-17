package nl.barbarossa040.core.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class RemoteDataSource_Factory implements Factory<RemoteDataSource> {
  private final Provider<MovieService> movieServiceProvider;

  public RemoteDataSource_Factory(Provider<MovieService> movieServiceProvider) {
    this.movieServiceProvider = movieServiceProvider;
  }

  @Override
  public RemoteDataSource get() {
    return newInstance(movieServiceProvider.get());
  }

  public static RemoteDataSource_Factory create(
      javax.inject.Provider<MovieService> movieServiceProvider) {
    return new RemoteDataSource_Factory(Providers.asDaggerProvider(movieServiceProvider));
  }

  public static RemoteDataSource_Factory create(Provider<MovieService> movieServiceProvider) {
    return new RemoteDataSource_Factory(movieServiceProvider);
  }

  public static RemoteDataSource newInstance(MovieService movieService) {
    return new RemoteDataSource(movieService);
  }
}
