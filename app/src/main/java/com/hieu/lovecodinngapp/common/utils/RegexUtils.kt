package com.hieu.lovecodinngapp.common.utils

class RegexUtils {
    companion object {
        fun validateEmail(email: String?): Boolean {
            return !email.isNullOrEmpty()
        }
    }
}