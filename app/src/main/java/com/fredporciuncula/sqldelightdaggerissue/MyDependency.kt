package com.fredporciuncula.sqldelightdaggerissue

import android.util.Log
import javax.inject.Inject

class MyDependency @Inject constructor() {
    fun bla() {
        Log.d("MyDependency", "bla")
    }
}