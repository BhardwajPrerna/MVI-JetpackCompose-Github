package com.abhishek.pathak.kotlin.android.githubcompose.data

object Endpoints {
    const val BASE_URL = "https://api.thecatapi.com/v1/"

    const val GET_USERS = "breeds"
    const val GET_USER = "images/search?breed_ids={userLogin}"
    const val GET_REPOS_BY_USER = "users/{userLogin}/repos?sort=stars&order=desc"
}
