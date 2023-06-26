package br.com.datehunter.presenter.fragments.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.datehunter.databinding.FragmentProfileBinding
import br.com.datehunter.presenter.base.BaseFragment

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(layoutInflater, container, false)
    }

    override fun setUpFragment() {
        setUpObservables()
    }

    private fun setUpObservables() {

    }


}