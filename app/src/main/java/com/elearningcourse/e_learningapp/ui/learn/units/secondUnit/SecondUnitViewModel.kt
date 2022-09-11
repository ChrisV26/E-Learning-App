package com.elearningcourse.e_learningapp.ui.learn.units.secondUnit

import android.content.Context
import androidx.lifecycle.ViewModel

class SecondUnitViewModel : ViewModel() {

    fun readFromSecondMaterial(context: Context, fileName: String) =
        context
            .assets
            .open(fileName)
            .bufferedReader()
            .use { it.readText() }

}