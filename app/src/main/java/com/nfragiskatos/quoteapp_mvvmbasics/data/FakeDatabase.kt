package com.nfragiskatos.quoteapp_mvvmbasics.data

/**
 * Created by Nicholas Fragiskatos on 4/17/2020.
 */
class FakeDatabase private constructor() {

    var quoteDao = FakeQuoteDao()
        private set

    companion object {
        @Volatile
        private var instance: FakeDatabase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also { instance = it }
            }
    }
}