package com.ericdecanini.chaquopytesttwo

import android.app.Application
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initPython()
    }

    private fun initPython() {
        if (!Python.isStarted()) {
            Python.start(AndroidPlatform(this))
        }
    }
}