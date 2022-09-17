package com.elearningcourse.e_learningapp.ui.learn.units.thirdUnit

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.elearningcourse.e_learningapp.data.dataSource.DataSource

class ThirdUnitViewModel(private val dataSource: DataSource) : ViewModel() {

    val planetListLiveData = dataSource.getPlanetList()

    class PlanetListViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ThirdUnitViewModel::class.java)) {
                return ThirdUnitViewModel(
                    dataSource = DataSource.getDataSource(context.resources)
                ) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}