package br.com.datehunter.presenter.fragments.signIn

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import br.com.datehunter.MainActivity
import br.com.datehunter.R
import br.com.datehunter.databinding.FragmentSignInBinding
import br.com.datehunter.presenter.base.BaseFragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignInFragment : BaseFragment<FragmentSignInBinding>() {

    private val signInViewModel: SignInViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentSignInBinding {
        return FragmentSignInBinding.inflate(layoutInflater, container, false)
    }

    override fun setUpFragment() {
        binding.signIn.setOnClickListener {
            signInViewModel.signIn(
                (activity as MainActivity),
                binding.username.text.toString(),
                binding.password.text.toString(),
                findNavController()
            )
        }
        binding.signUp.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
    }

}