package com.hieu.lovecodinngapp.features.auth.login

import android.util.Log
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.hieu.domain.usecases.VerifyOtpCodeUseCase
import com.hieu.lovecodinngapp.common.utils.RegexUtils

class LoginViewModel : ViewModel() {
    var textInput: ObservableField<String>? = null
    var btnEnable: ObservableBoolean? = null

    private val usecase : VerifyOtpCodeUseCase? = null

    init {
        btnEnable = ObservableBoolean(false)
        textInput = ObservableField("")
    }

    fun onTextInputChange(s: CharSequence, start: Int, befor: Int, count: Int) {
        btnEnable?.set(RegexUtils.validateEmailPyco(textInput?.get()!!))
    }

    fun onTapBtn() {
        if(usecase?.execute(textInput?.get()) == true) {

        }
    }

}