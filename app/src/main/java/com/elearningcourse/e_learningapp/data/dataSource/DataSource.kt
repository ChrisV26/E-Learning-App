package com.elearningcourse.e_learningapp.data.dataSource

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.elearningcourse.e_learningapp.data.model.Planet
import com.elearningcourse.e_learningapp.data.model.createPlanetList

class DataSource(resources: Resources) {
    private val planetList = createPlanetList(resources)
    private val planetsListLiveData = MutableLiveData(planetList)

    fun getPlanetList(): LiveData<List<Planet>> {
        return planetsListLiveData
    }

    companion object {
        private var INSTANCE: DataSource? = null

        fun getDataSource(resources: Resources): DataSource {
            return synchronized(DataSource::class) {
                val newInstance = INSTANCE ?: DataSource(resources)
                INSTANCE = newInstance
                newInstance
            }
        }
    }
}