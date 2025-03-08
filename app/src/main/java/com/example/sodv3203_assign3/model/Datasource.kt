package com.example.sodv3203_assign3.model

import androidx.compose.ui.res.stringResource
import com.example.sodv3203_assign3.data.DailyTip
import com.example.sodv3203_assign3.R


class Datasource {

    fun loadDailyTipData(): List<DailyTip> {

        return listOf<DailyTip>(
            DailyTip(R.string.dailyTip1, R.drawable.image1, R.string.dailyTipImageDescription1),
            DailyTip(R.string.dailyTip2, R.drawable.image2, R.string.dailyTipImageDescription2),
            DailyTip(R.string.dailyTip3, R.drawable.image3, R.string.dailyTipImageDescription3),
            DailyTip(R.string.dailyTip4, R.drawable.image4, R.string.dailyTipImageDescription4),
            DailyTip(R.string.dailyTip5, R.drawable.image5, R.string.dailyTipImageDescription5),
            DailyTip(R.string.dailyTip6, R.drawable.image6, R.string.dailyTipImageDescription6),
            DailyTip(R.string.dailyTip7, R.drawable.image7, R.string.dailyTipImageDescription7),
            DailyTip(R.string.dailyTip8, R.drawable.image8, R.string.dailyTipImageDescription8),
            DailyTip(R.string.dailyTip9, R.drawable.image9, R.string.dailyTipImageDescription9),
            DailyTip(R.string.dailyTip10, R.drawable.image10, R.string.dailyTipImageDescription10)

        )
    }
}