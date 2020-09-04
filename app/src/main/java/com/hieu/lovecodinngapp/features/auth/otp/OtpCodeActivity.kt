package com.hieu.lovecodinngapp.features.auth.otp

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.hieu.lovecodinngapp.R
import com.hieu.lovecodinngapp.common.utils.RegexUtils
import com.hieu.lovecodinngapp.databinding.ActivityOtpcodeBinding
import kotlinx.android.synthetic.main.activity_otpcode.*

class OtpCodeActivity: Activity() {
    lateinit var binding: ActivityOtpcodeBinding
     var viewModel = OtpCodeViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_otpcode)
        binding.viewModel = viewModel

        btnSubmit.setOnClickListener {
            // TODO
        }
//        edtOtpCode.OnEditorActionList
    }

    private fun onTapOTPCode() {

    }
}