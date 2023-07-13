package br.com.datehunter.presenter.fragments.splash

import android.os.Handler
import android.os.Looper
import androidx.navigation.NavController
import br.com.datehunter.R
import br.com.datehunter.presenter.base.BaseViewModel
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SplashViewModel : BaseViewModel() {

    fun getCurrentUser(): FirebaseUser? {
        val auth = Firebase.auth
        return auth.currentUser
    }

    fun goToSignIn(navController: NavController) {
        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.action_splashFragment_to_signInFragment)
        }, 3000)
    }

    fun goToHome(navController: NavController) {
        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.action_splashFragment_to_nav_home)
        }, 3000)
    }

}