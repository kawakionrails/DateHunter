package br.com.datehunter

import br.com.datehunter.databinding.ActivityMainBinding
import br.com.datehunter.presenter.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setUpActivity() {
        // TODO: Not yet implemented
    }

}