package com.hieu.lovecodinngapp.features.auth.otpcode

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.hieu.lovecodinngapp.R
import com.hieu.lovecodinngapp.common.base.BaseActivity
import com.hieu.lovecodinngapp.databinding.ActivityVerifyotpBinding
import kotlinx.android.synthetic.main.activity_verifyotp.*

class VerifyOtpActivity : BaseActivity() {
    lateinit var binding: ActivityVerifyotpBinding
    var viewmodel =
        VerifyOtpCodeViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_verifyotp)
        binding.viewModel = viewmodel
    }
}