package com.hieu.lovecodinngapp.features.auth.otp

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.hieu.lovecodinngapp.common.utils.RegexUtils

class OtpCodeViewModel : ViewModel(){
    val otpCodeValue =  ObservableField<String> ("")
    val enable : Boolean
    get() = RegexUtils.validateEmail(otpCodeValue.get())
}