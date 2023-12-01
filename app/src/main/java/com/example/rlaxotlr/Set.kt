package com.example.rlaxotlr

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Set(
    val set_num:Int,
    val weight: Int,
    val num: Int
): Parcelable