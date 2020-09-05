package com.hieu.domain.entitys

import kotlin.math.abs

data class NewsItem (
    val id : String,
    val title: String,
    val description : String,
    val publishTime: Long
) {
    fun isOutDated(time: Long) : Boolean {
        return abs(time - publishTime) >= OUTDATED_PERIOD
    }

    companion object {
        const val OUTDATED_PERIOD = 7 * 24 * 60 * 60 * 1000;
    }
}