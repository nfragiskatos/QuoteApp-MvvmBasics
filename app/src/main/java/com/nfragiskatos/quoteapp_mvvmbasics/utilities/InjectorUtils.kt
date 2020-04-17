package com.nfragiskatos.quoteapp_mvvmbasics.utilities

import com.nfragiskatos.quoteapp_mvvmbasics.UI.quotes.QuotesViewModelFactory
import com.nfragiskatos.quoteapp_mvvmbasics.data.FakeDatabase
import com.nfragiskatos.quoteapp_mvvmbasics.data.QuoteRepository

/**
 * Created by Nicholas Fragiskatos on 4/17/2020.
 */
object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}