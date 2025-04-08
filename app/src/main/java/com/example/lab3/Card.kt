package com.example.lab3

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Card(
    @StringRes val titleResourceId: Int,
    @StringRes val genreResourceId: Int,
    @StringRes val infoResourceId: Int,
    @DrawableRes val imageResourceId: Int
)