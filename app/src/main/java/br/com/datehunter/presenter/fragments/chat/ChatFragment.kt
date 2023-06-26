package br.com.datehunter.presenter.fragments.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import br.com.datehunter.databinding.FragmentChatBinding
import br.com.datehunter.presenter.base.BaseFragment

class ChatFragment : BaseFragment<FragmentChatBinding>() {
    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentChatBinding {
        return FragmentChatBinding.inflate(layoutInflater, container, false)
    }

    override fun setUpFragment() {
        setUpObservables()
    }

    private fun setUpObservables() {

    }


}