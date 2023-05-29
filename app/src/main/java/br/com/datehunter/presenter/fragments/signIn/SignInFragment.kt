package br.com.datehunter.presenter.fragments.signIn

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import br.com.datehunter.MainActivity
import br.com.datehunter.databinding.FragmentSignInBinding
import br.com.datehunter.presenter.base.BaseFragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignInFragment : BaseFragment<FragmentSignInBinding>() {

    private val signInViewModel: SignInViewModel by viewModels()
    private lateinit var firebaseAuth: FirebaseAuth

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentSignInBinding {
        return FragmentSignInBinding.inflate(layoutInflater, container, false)
    }

    override fun setUpFragment() {
        firebaseAuth = Firebase.auth
        binding.signIn.setOnClickListener {
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()
            signIn(
                (activity as MainActivity),
                username,
                password
            )
        }
    }

    private fun signIn(
        mainActivity: MainActivity,
        username: String,
        password: String
    ) {
        firebaseAuth.signInWithEmailAndPassword(username, password)
            .addOnCompleteListener(mainActivity) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(mainActivity, "deu bom, caralho", Toast.LENGTH_SHORT).show()
                } else {
                    Log.e("~", "signIn: ${task.exception}")
                }
            }
    }

}