package com.example.sodv3203_assign3.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DailyTip(
    @StringRes val stringResTipId: Int,
    @DrawableRes val imageResTipId: Int,
    @StringRes val dailyTipImageDescription: Int
)
