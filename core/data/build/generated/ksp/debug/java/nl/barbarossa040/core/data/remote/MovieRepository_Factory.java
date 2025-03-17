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
public final class MovieRepository_Factory implements Factory<MovieRepository> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  public MovieRepository_Factory(Provider<RemoteDataSource> remoteDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public MovieRepository get() {
    return newInstance(remoteDataSourceProvider.get());
  }

  public static MovieRepository_Factory create(
      javax.inject.Provider<RemoteDataSource> remoteDataSourceProvider) {
    return new MovieRepository_Factory(Providers.asDaggerProvider(remoteDataSourceProvider));
  }

  public static MovieRepository_Factory create(
      Provider<RemoteDataSource> remoteDataSourceProvider) {
    return new MovieRepository_Factory(remoteDataSourceProvider);
  }

  public static MovieRepository newInstance(RemoteDataSource remoteDataSource) {
    return new MovieRepository(remoteDataSource);
  }
}
