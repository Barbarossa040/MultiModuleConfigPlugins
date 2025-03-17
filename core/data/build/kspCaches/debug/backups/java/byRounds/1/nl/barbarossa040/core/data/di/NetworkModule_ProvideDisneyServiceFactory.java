package nl.barbarossa040.core.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import nl.barbarossa040.core.data.remote.MovieService;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideDisneyServiceFactory implements Factory<MovieService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideDisneyServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MovieService get() {
    return provideDisneyService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideDisneyServiceFactory create(
      javax.inject.Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideDisneyServiceFactory(Providers.asDaggerProvider(retrofitProvider));
  }

  public static NetworkModule_ProvideDisneyServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideDisneyServiceFactory(retrofitProvider);
  }

  public static MovieService provideDisneyService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideDisneyService(retrofit));
  }
}
