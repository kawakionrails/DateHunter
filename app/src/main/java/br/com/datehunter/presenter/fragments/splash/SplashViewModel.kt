package br.com.datehunter.presenter.fragments.splash

import android.os.Handler
import android.os.Looper
import androidx.navigation.NavController
import br.com.datehunter.R
import br.com.datehunter.presenter.base.BaseViewModel

class SplashViewModel : BaseViewModel() {

    fun goToHome(navController: NavController) {
        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.action_splashFragment_to_signInFragment)
        }, 3000)
    }

}