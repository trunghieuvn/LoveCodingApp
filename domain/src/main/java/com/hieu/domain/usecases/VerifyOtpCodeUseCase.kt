package com.hieu.domain.usecases

import com.hieu.domain.dao.AuthenticationRepository

interface VerifyOtpCodeUseCase {
    fun execute(otpCode : String?) : Boolean
}

class VerifyOtpCodeUseCaseImpl(private val authenticationRepository: AuthenticationRepository) : VerifyOtpCodeUseCase {
    override fun execute(otpCode : String?): Boolean {
        return authenticationRepository.verifyOtpCode(otpCode)
    }
}