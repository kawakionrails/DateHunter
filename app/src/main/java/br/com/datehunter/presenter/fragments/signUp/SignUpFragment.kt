package br.com.datehunter.presenter.fragments.signUp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import br.com.datehunter.MainActivity
import br.com.datehunter.R
import br.com.datehunter.databinding.FragmentSignUpBinding
import br.com.datehunter.presenter.base.BaseFragment

class SignUpFragment : BaseFragment<FragmentSignUpBinding>() {

    private val signUpViewModel: SignUpViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentSignUpBinding {
        return FragmentSignUpBinding.inflate(layoutInflater, container, false)
    }

    override fun setUpFragment() {
        binding.signUp.setOnClickListener {
            signUpViewModel.signUp(
                (activity as MainActivity),
                binding.username.text.toString(),
                binding.password.text.toString(),
                binding.confirmPassword.text.toString(),
                findNavController()
            )
        }
        binding.signIn.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}