package com.kauzgana.timberlife

import androidx.lifecycle.ViewModel
import timber.log.Timber

class MainViewModel : ViewModel (){

    init{
        Timber.i("MainViewModel created")
    }
}