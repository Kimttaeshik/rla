package com.example.rlaxotlr

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Exercise_kind(val Sets: ArrayList<Set>, val exercise_name: String): Parcelable