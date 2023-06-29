package br.com.datehunter.presenter

import android.view.View
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import br.com.datehunter.R
import br.com.datehunter.databinding.ActivityMainBinding
import br.com.datehunter.presenter.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val mainViewModel: MainViewModel by viewModels()
    private val navHostFragment: NavHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
    }
    private val navController: NavController by lazy {
        navHostFragment.navController
    }
    private val destinationChangedListener: NavController.OnDestinationChangedListener =
        NavController.OnDestinationChangedListener { _, _, _ ->
            val currentScreen = navController.currentDestination?.id
            if (mainViewModel.getFragmentsWithoutBottomNavigation().contains(currentScreen)) {
                binding.bottomNavigationLayout.visibility = View.GONE
            } else {
                binding.bottomNavigationLayout.visibility = View.VISIBLE
            }
        }

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setUpActivity() {
        setUpObservables()
    }

    private fun setUpObservables() {
        navController.addOnDestinationChangedListener(destinationChangedListener)
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    navController.navigate(R.id.action_global_homeFragment)
                    true
                }

                R.id.chat -> {
                    navController.navigate(R.id.action_global_chatFragment)
                    true
                }

                R.id.profile -> {
                    navController.navigate(R.id.action_global_profileFragment)
                    true
                }

                else -> {
                    false
                }
            }
        }
    }

}