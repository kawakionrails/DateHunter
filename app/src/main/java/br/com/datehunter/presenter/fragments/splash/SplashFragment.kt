package br.com.datehunter.presenter.fragments.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.datehunter.databinding.FragmentSplashBinding
import br.com.datehunter.presenter.base.BaseFragment

class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(layoutInflater, container, false)
    }

    override fun setUpFragment() {
    }
}