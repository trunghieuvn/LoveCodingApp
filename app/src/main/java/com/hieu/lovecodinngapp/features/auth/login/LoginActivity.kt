package com.hieu.lovecodinngapp.features.auth.login

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hieu.lovecodinngapp.R
import com.hieu.lovecodinngapp.common.base.BaseActivity
import com.hieu.lovecodinngapp.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() {
    lateinit var binding: ActivityLoginBinding
    var viewmodel = LoginViewModel()

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        binding.viewModel = viewmodel
    }
}