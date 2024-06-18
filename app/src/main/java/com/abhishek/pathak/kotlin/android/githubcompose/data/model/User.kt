package com.abhishek.pathak.kotlin.android.githubcompose.data.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id") val userId: String = "",
    @SerializedName("wikipedia_url") val avatarUrl: String = "",
    @SerializedName("name") val htmlUrl: String = "",
   // @SerializedName("id") val id: String = "",
)

fun buildUserPreview() = User(
    userId = "51234843",
    avatarUrl = "https://avatars.githubusercontent.com/myofficework000",
    htmlUrl = "https://github.com/51234843",
    //id = "1"
)
