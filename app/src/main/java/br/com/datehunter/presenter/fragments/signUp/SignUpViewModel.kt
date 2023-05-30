package br.com.datehunter.presenter.fragments.signUp

import android.util.Log
import android.widget.Toast
import androidx.navigation.NavController
import br.com.datehunter.MainActivity
import br.com.datehunter.R
import br.com.datehunter.common.constants.PASSWORD_REGEX
import br.com.datehunter.presenter.base.BaseViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignUpViewModel : BaseViewModel() {

    private lateinit var firebaseAuth: FirebaseAuth

    fun signUp(
        mainActivity: MainActivity,
        username: String,
        password: String,
        confirmPassword: String,
        navController: NavController
    ) {
        if (PASSWORD_REGEX.matches(password)) {
            if (password == confirmPassword) {
                firebaseAuth = Firebase.auth
                firebaseAuth.createUserWithEmailAndPassword(username, password)
                    .addOnCompleteListener(mainActivity) { task ->
                        if (task.isSuccessful) {
                            navController.navigate(R.id.action_signUpFragment_to_homeFragment)
                        } else {
                            Log.e("TAG", "signUp: ${task.exception}.")
                        }
                    }
            } else {
                Toast.makeText(
                    mainActivity,
                    "as senhas precisam ser iguais",
                    Toast.LENGTH_SHORT
                ).show()
            }
        } else {
            Toast.makeText(
                mainActivity,
                "faça uma senha melhor, seu bosta",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}