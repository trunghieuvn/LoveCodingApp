package com.hieu.domain.dao


interface AuthenticationRepository {
    fun verifyOtpCode(otpCode: String?): Boolean
}

class AuthenticationRepositoryImpl : AuthenticationRepository {
    override fun verifyOtpCode(otpCode: String?): Boolean {
        return otpCode.equals("123456")
    }

}