package com.example.sodv3203_assign3.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DailyRiddle(
    @StringRes val stringResourceRiddle: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val imageDescription: Int,
    @StringRes val stringResourceRiddleAnswer: Int
)
