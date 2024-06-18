package com.abhishek.pathak.kotlin.android.githubcompose.di

import com.abhishek.pathak.kotlin.android.githubcompose.data.GithubApi
import com.abhishek.pathak.kotlin.android.githubcompose.data.Endpoints
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Constants {
    const val API_KEY = "live_VupSQj3zUbNxiwOwQLp5VEZV5A5UwcGoY0y33VV1hZ4fhfEjdoKX0c3BUUmNtZiq"
}

val appModule = module {

    single {
        OkHttpClient.Builder()
            .addInterceptor(ApiKeyInterceptor())
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(Endpoints.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single {
        get<Retrofit>().create(GithubApi::class.java)
    }
}

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
        val originalRequest = chain.request()
        val newRequest = originalRequest.newBuilder()
            .header("Authorization", "token ${Constants.API_KEY}")
            .build()
        return chain.proceed(newRequest)
    }
}

val appModules = listOf(
    appModule,
    repositoryModule,
    viewModelModule
)
