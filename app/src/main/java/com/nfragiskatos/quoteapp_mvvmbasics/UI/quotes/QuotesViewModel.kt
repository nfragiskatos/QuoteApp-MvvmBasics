package com.nfragiskatos.quoteapp_mvvmbasics.UI.quotes

import androidx.lifecycle.ViewModel
import com.nfragiskatos.quoteapp_mvvmbasics.data.Quote
import com.nfragiskatos.quoteapp_mvvmbasics.data.QuoteRepository

/**
 * Created by Nicholas Fragiskatos on 4/17/2020.
 */
class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}