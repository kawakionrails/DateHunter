package br.com.datehunter.presenter.activities.main

import br.com.datehunter.R
import br.com.datehunter.presenter.base.BaseViewModel

class MainViewModel : BaseViewModel() {

    fun getFragmentsWithoutBottomNavigation(): List<Int> {
        return listOf(
            R.id.splashFragment,
            R.id.signInFragment,
            R.id.signUpFragment
        )
    }

}