package com.example.moscowtravelhack.di.deps.network


import com.example.moscowtravelhack.core.networking.ApiService
import com.example.moscowtravelhack.di.scope.ApplicationScope
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Modifier

@Module
class RetrofitModule {

    companion object {
        private const val BASE_URL =
            "https://moscowtravelhackapi20200209010558.azurewebsites.net/api/v1/"
        private const val DATE_FORMAT = "yyyy-MM-dd HH:mm:ss"
    }

    @Provides
    @ApplicationScope
    fun provideAviaApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @ApplicationScope
    fun provideRetrofit(gson: Gson, httpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(httpClient)
            .baseUrl(BASE_URL)
            .build()
    }

    @Provides
    @ApplicationScope
    fun provideGson(): Gson {
        return GsonBuilder()
            .setLenient()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
            .setDateFormat(DATE_FORMAT)
            .setPrettyPrinting()
            .create()
    }

    @Provides
    @ApplicationScope
    fun provideHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        val client = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .hostnameVerifier { _, _ -> true }
        return client.build()
    }

    @Provides
    @ApplicationScope
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }
}