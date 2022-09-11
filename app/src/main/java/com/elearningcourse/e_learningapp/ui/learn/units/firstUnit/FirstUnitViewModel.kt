package com.elearningcourse.e_learningapp.ui.learn.units.firstUnit

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel

class FirstUnitViewModel(application: Application) : AndroidViewModel(application) {

    fun readFirstUnitMaterial(context: Context, fileName: String): String =
        context
            .assets
            .open(fileName)
            .bufferedReader()
            .use { it.readText() }


}