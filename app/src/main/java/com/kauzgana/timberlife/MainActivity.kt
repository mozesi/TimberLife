package com.kauzgana.timberlife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleObserver

class MainActivity : AppCompatActivity() {

    lateinit var myLife: MyLife

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myLife = MyLife(this.lifecycle)
    }
}