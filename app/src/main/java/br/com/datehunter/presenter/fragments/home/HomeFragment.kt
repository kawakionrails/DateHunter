package br.com.datehunter.presenter.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.datehunter.databinding.FragmentHomeBinding
import br.com.datehunter.presenter.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentHomeBinding? {
        return FragmentHomeBinding.inflate(layoutInflater, container, false)
    }

    override fun setUpFragment() {
        // TODO: Not yet implemented
    }

}