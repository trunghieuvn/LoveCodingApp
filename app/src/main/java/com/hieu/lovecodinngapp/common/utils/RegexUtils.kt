package com.hieu.lovecodinngapp.common.utils

import android.view.WindowInsets.Side.all
import java.util.regex.Pattern

class RegexUtils {
    companion object {
        fun validateEmailPyco(email: String?): Boolean {
            val expression = "[a-z0-9._-]+@pycogroup+(\\.[a-z0-9]{2,4}){1,2}"
            val pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE)
            val matcher = pattern.matcher(email?.toLowerCase())
            return matcher.matches()
        }

        fun validateOtpCode(otpCode: String?) : Boolean {
            val expression = "^[0-9]+\$"
            val pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE)
            val matcher = pattern.matcher(otpCode)
            return otpCode?.length == 6 &&  matcher.matches()
        }
    }
}