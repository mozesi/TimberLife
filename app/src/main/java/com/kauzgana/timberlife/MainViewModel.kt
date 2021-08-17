package com.kauzgana.timberlife

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class MainViewModel : ViewModel (){

    val word = MutableLiveData<String>()
    // The current score
    val score = MutableLiveData<Int>()
    init{
        word.value = "mose msukwa"
        score.value = 88993
    }
}