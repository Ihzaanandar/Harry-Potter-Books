package com.raja.laprak7

import com.google.gson.annotations.SerializedName

data class Book(
    val title: String?,
    val releaseDate: String?,
    val description: String?,
    val cover: String?,
    val pages : Int?
)
