package com.example.sodv3203_assign3.model

import androidx.compose.ui.res.stringResource
import com.example.sodv3203_assign3.data.DailyRiddle
import com.example.sodv3203_assign3.R


class Datasource {

    fun loadDailyRiddleData(): List<DailyRiddle> {

        return listOf<DailyRiddle>(
            DailyRiddle(R.string.riddle1, R.drawable.img1echo, R.string.imageDescription1, R.string.riddleAnswer1),
            DailyRiddle(R.string.riddle2, R.drawable.img2keyboard, R.string.imageDescription2, R.string.riddleAnswer2),
            DailyRiddle(R.string.riddle3, R.drawable.img3clock, R.string.imageDescription3, R.string.riddleAnswer3),
            DailyRiddle(R.string.riddle4, R.drawable.img4letterm, R.string.imageDescription4, R.string.riddleAnswer4),
            DailyRiddle(R.string.riddle5, R.drawable.img5joke, R.string.imageDescription5, R.string.riddleAnswer5),
            DailyRiddle(R.string.riddle6, R.drawable.img6footsteps, R.string.imageDescription6, R.string.riddleAnswer6),
            DailyRiddle(R.string.riddle7, R.drawable.img7cloud, R.string.imageDescription7, R.string.riddleAnswer7),
            DailyRiddle(R.string.riddle8, R.drawable.img8mailbox, R.string.imageDescription8, R.string.riddleAnswer8),
            DailyRiddle(R.string.riddle9, R.drawable.img9barber, R.string.imageDescription9, R.string.riddleAnswer9),
            DailyRiddle(R.string.riddle10, R.drawable.img10egg, R.string.imageDescription10, R.string.riddleAnswer10),


            DailyRiddle(R.string.riddle11, R.drawable.img11needle, R.string.imageDescription11, R.string.riddleAnswer11),
            DailyRiddle(R.string.riddle12, R.drawable.img12stamp, R.string.imageDescription12, R.string.riddleAnswer12),
            DailyRiddle(R.string.riddle13, R.drawable.img13towel, R.string.imageDescription13, R.string.riddleAnswer13),
            DailyRiddle(R.string.riddle14, R.drawable.img14human, R.string.imageDescription14, R.string.riddleAnswer14),
            DailyRiddle(R.string.riddle15, R.drawable.img15bank, R.string.imageDescription15, R.string.riddleAnswer15),
            DailyRiddle(R.string.riddle16, R.drawable.img16artichoke, R.string.imageDescription16, R.string.riddleAnswer16),
            DailyRiddle(R.string.riddle17, R.drawable.img17fire, R.string.imageDescription17, R.string.riddleAnswer17),
            DailyRiddle(R.string.riddle18, R.drawable.img18bottle, R.string.imageDescription18, R.string.riddleAnswer18),
            DailyRiddle(R.string.riddle19, R.drawable.img19yourname, R.string.imageDescription19, R.string.riddleAnswer19),
            DailyRiddle(R.string.riddle20, R.drawable.img20candle, R.string.imageDescription20, R.string.riddleAnswer20),
            DailyRiddle(R.string.riddle21, R.drawable.img21rain, R.string.imageDescription21, R.string.riddleAnswer21),
            DailyRiddle(R.string.riddle22, R.drawable.img22candle, R.string.imageDescription22, R.string.riddleAnswer22),
            DailyRiddle(R.string.riddle23, R.drawable.img23light, R.string.imageDescription23, R.string.riddleAnswer23),
            DailyRiddle(R.string.riddle24, R.drawable.img24yourage, R.string.imageDescription24, R.string.riddleAnswer24),
            DailyRiddle(R.string.riddle25, R.drawable.img25penny, R.string.imageDescription25, R.string.riddleAnswer25),
            DailyRiddle(R.string.riddle26, R.drawable.img26piano, R.string.imageDescription26, R.string.riddleAnswer26),
            DailyRiddle(R.string.riddle27, R.drawable.img27comb, R.string.imageDescription27, R.string.riddleAnswer27),
            DailyRiddle(R.string.riddle28, R.drawable.img28river, R.string.imageDescription28, R.string.riddleAnswer28),
            DailyRiddle(R.string.riddle29, R.drawable.img29acold, R.string.imageDescription29, R.string.riddleAnswer29),
            DailyRiddle(R.string.riddle30, R.drawable.img30map, R.string.imageDescription30, R.string.riddleAnswer30)

        )
    }
}