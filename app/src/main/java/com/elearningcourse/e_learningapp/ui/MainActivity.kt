package com.elearningcourse.e_learningapp.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.elearningcourse.e_learningapp.R
import com.elearningcourse.e_learningapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.bottomNavView

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment  // val navController = findNavController(R.id.nav_host_fragment_activity_main)

        val navController = navHostFragment.navController
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home_learn_material,
                R.id.navigation_questions_answers,
                R.id.navigation_stats
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        hideBottomNav(navController)
    }

    /**
     * Hide Bottom Navigation Menu in specific screens
     * */
    private fun hideBottomNav(navController: NavController) {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.first_unit || destination.id == R.id.second_unit || destination.id == R.id.third_unit
                || destination.id == R.id.first_unit_test || destination.id == R.id.second_unit_test || destination.id == R.id.third_unit_test || destination.id == R.id.revision_test
            )
                binding.bottomNavView.visibility = View.GONE
            else {
                binding.bottomNavView.visibility = View.VISIBLE
            }
        }
    }

    /**
     * Handle Up navigation from Action Bar
     * */
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

}