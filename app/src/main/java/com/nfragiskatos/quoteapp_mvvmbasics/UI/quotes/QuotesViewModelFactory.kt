package com.nfragiskatos.quoteapp_mvvmbasics.UI.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nfragiskatos.quoteapp_mvvmbasics.data.QuoteRepository

/**
 * Created by Nicholas Fragiskatos on 4/17/2020.
 */
class QuotesViewModelFactory(private val quoteRepository: QuoteRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}