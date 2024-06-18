package com.abhishek.pathak.kotlin.android.githubcompose.data.model

import com.google.gson.annotations.SerializedName

data class UserDetail(
    @SerializedName("cfa_url") val avatarUrl: String = "",
    @SerializedName("vetstreet_url") val htmlUrl: String = "",
    @SerializedName("name") val name: String = "",
    @SerializedName("origin") val location: String? = "",
    @SerializedName("wikipedia_url") val blogUrl: String = "",
    @SerializedName("adaptability") val publicRepos: Int = 0,
    @SerializedName("energy_level") val followers: Int = 0,
    @SerializedName("health_issues") val following: Int = 0,
)

fun buildUserDetailPreview() = UserDetail(
    avatarUrl = "https://avatars.githubusercontent.com/myofficework000",
    htmlUrl = "https://github.com/51234843",
    name = "Abhishek Pathak",
    location = "London",
    publicRepos = 50,
    followers = 50,
    following = 0
)
