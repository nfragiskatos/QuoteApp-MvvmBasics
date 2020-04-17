package com.nfragiskatos.quoteapp_mvvmbasics.data

/**
 * Created by Nicholas Fragiskatos on 4/17/2020.
 */
data class Quote(val quoteText: String, val quoteAuthor: String) {

    override fun toString(): String {
        return "$quoteText - $quoteAuthor"
    }
}