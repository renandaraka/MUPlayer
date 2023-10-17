package com.raka.muplayer

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    var name: String = "",
    var description: String = "",
    var overall: String = "",
    var detail: String = "",
    var photo: Int = 0
) : Parcelable
