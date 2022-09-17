package com.elearningcourse.e_learningapp.data.model

import android.content.res.Resources
import com.elearningcourse.e_learningapp.R

fun createPlanetList(resources: Resources): List<Planet> {
    return listOf(
        Planet(
            id = 1,
            name = resources.getString(R.string.planet_earth),
            planetImage = R.drawable.earth,
            description = resources.getString(R.string.planet_earth_desc)
        ),
        Planet(
            id = 2,
            name = resources.getString(R.string.planet_jupiter),
            planetImage = R.drawable.jupiter,
            description = resources.getString(R.string.planet_jupiter_desc)
        ),
        Planet(
            id = 3,
            name = resources.getString(R.string.planet_mars),
            planetImage = R.drawable.mars,
            description = resources.getString(R.string.planet_mars_desc)
        ),
        Planet(
            id = 4,
            name = resources.getString(R.string.planet_mercury),
            planetImage = R.drawable.mercury,
            description = resources.getString(R.string.planet_mercury_desc)
        ),
        Planet(
            id = 5,
            name = resources.getString(R.string.planet_neptune),
            planetImage = R.drawable.neptune,
            description = resources.getString(R.string.planet_neptune_desc)
        ),
        Planet(
            id = 6,
            name = resources.getString(R.string.planet_saturn),
            planetImage = R.drawable.saturn,
            description = resources.getString(R.string.planet_saturn_desc)
        ),
        Planet(
            id = 7,
            name = resources.getString(R.string.planet_uranus),
            planetImage = R.drawable.uranus,
            description = resources.getString(R.string.planet_uranus_desc)
        ),
        Planet(
            id = 8,
            name = resources.getString(R.string.planet_venus),
            planetImage = R.drawable.venus,
            description = resources.getString(R.string.planet_venus_desc)
        )
    )

}