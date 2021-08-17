package com.kauzgana.timberlife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModelProvider
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    lateinit var myLife: MyLife

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.i("view model call")
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        myLife = MyLife(this.lifecycle)

    }
}