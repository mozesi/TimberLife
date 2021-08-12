package com.kauzgana.timberlife

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import timber.log.Timber

class MyLife(lifecycle: Lifecycle):LifecycleObserver{

    init {
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent (Lifecycle.Event.ON_PAUSE)
    fun paused(){
          Timber.Forest.i("Am paused")
    }
    @OnLifecycleEvent (Lifecycle.Event.ON_STOP)
    fun stoped(){
        Timber.Forest.i("Am Stoped")
    }
    @OnLifecycleEvent (Lifecycle.Event.ON_START)
    fun started(){
        Timber.Forest.i("Am start")
    }
    @OnLifecycleEvent (Lifecycle.Event.ON_RESUME)
    fun resumed(){
        Timber.Forest.i("Am resume")
    }
}