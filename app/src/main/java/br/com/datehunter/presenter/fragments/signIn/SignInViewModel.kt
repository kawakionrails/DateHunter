package br.com.datehunter.presenter.fragments.signIn

import android.util.Log
import androidx.navigation.NavController
import br.com.datehunter.presenter.activities.main.MainActivity
import br.com.datehunter.R
import br.com.datehunter.presenter.base.BaseViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignInViewModel : BaseViewModel() {

    private lateinit var firebaseAuth: FirebaseAuth

    fun signIn(
        mainActivity: MainActivity,
        username: String,
        password: String,
        navController: NavController
    ) {
        if (username.isNullOrEmpty() || password.isNullOrEmpty()) {
            return
        }
        firebaseAuth = Firebase.auth
        firebaseAuth.signInWithEmailAndPassword(username, password)
            .addOnCompleteListener(mainActivity) { task ->
                if (task.isSuccessful) {
                    navController.navigate(R.id.action_signInFragment_to_homeFragment)
                } else {
                    Log.e("TAG", "signUp: ${task.exception}.")
                }
            }
    }

}